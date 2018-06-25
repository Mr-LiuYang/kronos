package com.liuyang.service.impl;


import com.liuyang.entity.*;
import com.liuyang.entitySec.YonyouPersonImportSec;
import com.liuyang.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by liuyang on 2018/6/24
 * 同步人事信息
 */
@Service
@Transactional("firstTransactionManager")
public class InformationSyncServiceImpl implements InformationSyncService {
    Logger logger = LoggerFactory.getLogger(InformationSyncServiceImpl.class);
    @Autowired
    private OfilmOrgService ofilmOrgService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private JobService jobService;
    @Autowired
    private PersontypeService persontypeService;
    @Autowired
    private VpALLPERSONV42Service vpALLPERSONV42Service;
    @Autowired
    private YonyouPersonImportService yonyouPersonImportService;
    @Autowired
    YonyouPersonImportServiceSec yonyouPersonImportServiceSec;
    @Autowired
    DepartmentServiceSec departmentServiceSec;

    /**
     * @return 人员信息是否同步成功
     * 同步人员信息
     */
    @Override
    @Transactional
    public boolean personInfoSync() {

//        1:从NC数据库获取人员信息
        List<YonyouPersonImportSec> yonyouPersonImportSecList = yonyouPersonImportServiceSec.getListByNC();//人事系统人事数据源头
//        1.1 根据对照表修改数据源
        List<YonyouPersonImport> yonyouPersonImportList = yonyouPersonImportService.findAll();//考勤系统人事数据
        compareUpdate(yonyouPersonImportSecList, yonyouPersonImportList);
//        2:检查每个字段，看是否有更新
//        3:把有离职后复职的人员信息同步,并把状态切换时间跟新为离职日期后一天
        boolean flag1 = restoration(yonyouPersonImportSecList, yonyouPersonImportList);
//        4:把离职人员的状态更新为离职
        boolean flag2 = quitUpdate(yonyouPersonImportSecList, yonyouPersonImportList);
//        5:把新入职的人员信息插入到表中
        boolean flag3 = insertNewPerson(yonyouPersonImportSecList, yonyouPersonImportList);
        if (flag1 && flag2 && flag3) {
            return true;
        }
        logger.error("同步人员信息错误" + flag1);
        logger.error("同步人员信息错误" + flag2);
        logger.error("同步人员信息错误" + flag3);
        return false;
    }

    private void compareUpdate(List<YonyouPersonImportSec> yonyouPersonImportSecList, List<YonyouPersonImport> yonyouPersonImportList) {
        List<Company> companies = companyService.findAll();
        List<Job> jobs = jobService.findAll();
        List<Persontype> persontypes = persontypeService.findAll();
        List<Department> departments = departmentService.findAll();

        for (YonyouPersonImportSec personImportSec : yonyouPersonImportSecList) {
            StringToDate(personImportSec);
            for (YonyouPersonImport yonyouPersonImport : yonyouPersonImportList) {
                if (personImportSec.getPersonnum().equals(yonyouPersonImport.getPersonnum())) {
                    yonyouPersonImport.setAttribute1(personImportSec.getBuName());
                    yonyouPersonImport.setAttribute3(personImportSec.getOutright());
                    yonyouPersonImport.setAttribute4(personImportSec.getCardfFlag());
                }
            }
            for (Company company : companies) {
                if (company.getCompanyName().equals(personImportSec.getHomelaborleveldsc1())) {   //根据公司中文名，将新系统编码转为老系统编码
                    personImportSec.setHomelaborlevelnm1(company.getSyskeyOld());
                }
            }
            for (Persontype persontype : persontypes) {
                if (persontype.getPersontypeName().equals(personImportSec.getHomelaborleveldsc3())) {  //根据人员类别，将新系统编码转为老系统编码
                    personImportSec.setHomelaborlevelnm3(persontype.getSyscodeOld());
                }
            }
            for (Department department: departments) {
                if(department.getDeptName().equals(personImportSec.getHomelaborleveldsc2())&&department.getSyscodeOld().startsWith(personImportSec.getHomelaborlevelnm1())){
                    personImportSec.setHomelaborlevelnm2(department.getSyscodeOld().split("_")[1]);
                }
            }
        }

    }

    private boolean insertNewPerson(List<YonyouPersonImportSec> yonyouPersonImportSecList, List<YonyouPersonImport> yonyouPersonImportList) {
        //获取所有工号，如果人事系统数据没有就插入
        boolean flag = false;
        try {
            Set<String> personNums = new HashSet<>(yonyouPersonImportList.size());
            for (YonyouPersonImport personImport : yonyouPersonImportList) {
                personNums.add(personImport.getPersonnum());
            }

            for (YonyouPersonImportSec importSec : yonyouPersonImportSecList) {
                if (!personNums.contains(importSec.getPersonnum())) {  //不包含
                    YonyouPersonImport yonyouPersonImport = new YonyouPersonImport();
                    BeanUtils.copyProperties(importSec, yonyouPersonImport);
                    yonyouPersonImport.setCreationDate(new Date());
                    yonyouPersonImport.setLastUpdateDate(new Date());
                    yonyouPersonImport.setProcessFlag("0");
                    yonyouPersonImportService.insert(yonyouPersonImport);
                }
            }
        } catch (Exception e) {
            logger.error("同步人员信息错误insertNewPerson方法");
            return flag;
        }
        return flag;
    }

    private void StringToDate(YonyouPersonImportSec importSec) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            importSec.setBirthday(sdf.parse(importSec.getBirthday1()));
            importSec.setEmploymentstatusdt(sdf.parse(importSec.getEmploymentstatusdt1()));
            importSec.setStartworkdate(sdf.parse(importSec.getStartworkdate1()));
            importSec.setHiredate(sdf.parse(importSec.getHiredate1()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private boolean quitUpdate(List<YonyouPersonImportSec> yonyouPersonImportSecList, List<YonyouPersonImport> yonyouPersonImportList) {
        boolean flag = true;
        try {
            Set<String> personNums = new HashSet<>(yonyouPersonImportSecList.size());
            for (YonyouPersonImportSec personImport : yonyouPersonImportSecList) {
                personNums.add(personImport.getPersonnum());
            }
            for (YonyouPersonImport yonyouPersonImport : yonyouPersonImportList) {
                if (!personNums.contains(yonyouPersonImport.getPersonnum())) {
                    yonyouPersonImport.setLastUpdateDate(new Date());
                    yonyouPersonImport.setQuittype("自离");
                    yonyouPersonImport.setEmploymentstatus("Terminated");
                    yonyouPersonImport.setProcessFlag("0");
                    yonyouPersonImport.setEmploymentstatusdt(new Date());
                    yonyouPersonImportService.update(yonyouPersonImport);
                }
            }
        } catch (Exception e) {
            logger.error("离职人员更新出错");
            return false;
        }
        return flag;
    }

    private boolean restoration(List<YonyouPersonImportSec> yonyouPersonImportSecList, List<YonyouPersonImport> yonyouPersonImportList) {
        boolean flag = true;
        try {
            for (YonyouPersonImportSec yonyouPersonImportSec : yonyouPersonImportSecList) {
                StringToDate(yonyouPersonImportSec);
                if ("Active".equals(yonyouPersonImportSec.getEmploymentstatus())) {
                    for (YonyouPersonImport yonyouPersonImport : yonyouPersonImportList) {
                        if (yonyouPersonImportSec.getPersonnum().equals(yonyouPersonImport.getPersonnum()) && "Terminated".equals(yonyouPersonImport.getEmploymentstatus())) {
                            BeanUtils.copyProperties(yonyouPersonImportSec, yonyouPersonImport);
                            yonyouPersonImport.setProcessFlag("0");
                            yonyouPersonImport.setLastUpdateDate(new Date());
                            yonyouPersonImportService.update(yonyouPersonImport);
                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.error("===========restoration===========error==");
            return false;
        }
        return flag;
    }


    /**
     * @return 部门信息是否同步成功
     * 同步部门信息
     */
    @Override
    @Transactional
    public boolean deptmentInfoSync() {
//        1:把NC数据库获取部门信息
//        1.1 根据对照表修改数据源
//        2:部门有变更则更新变更信息
//        3:部门封存的则把部门状态更新为失效
//        4:插入新增加的部门
        return false;
    }
}
