package com.liuyang.service.impl;


import com.liuyang.entity.*;
import com.liuyang.entitySec.DepartmentSec;
import com.liuyang.entitySec.YonyouPersonImportSec;
import com.liuyang.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

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
        boolean flag = compareUpdate(yonyouPersonImportSecList, yonyouPersonImportList);
//        2:检查每个字段，看是否有更新
//        3:把有离职后复职的人员信息同步,并把状态切换时间跟新为离职日期后一天
        boolean flag1 = restoration(yonyouPersonImportSecList, yonyouPersonImportList);
//        4:把离职人员的状态更新为离职
        boolean flag2 = quitUpdate(yonyouPersonImportSecList, yonyouPersonImportList);
//        5:把新入职的人员信息插入到表中
        boolean flag3 = insertNewPerson(yonyouPersonImportSecList, yonyouPersonImportList);
        if (flag && flag1 && flag2 && flag3) {
            return true;
        }
        logger.error("同步人员信息错误" + flag);
        logger.error("同步人员信息错误" + flag1);
        logger.error("同步人员信息错误" + flag2);
        logger.error("同步人员信息错误" + flag3);
        return false;
    }

    private boolean compareUpdate(List<YonyouPersonImportSec> yonyouPersonImportSecList, List<YonyouPersonImport> yonyouPersonImportList) {
        boolean flag = true;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<Persontype> persontypes = persontypeService.findAll();
        try {
            for (YonyouPersonImportSec personImportSec : yonyouPersonImportSecList) {

                Company company = null;
                if (!personImportSec.getCompanycode().isEmpty()) {
                    company = companyService.findBySyskey_New(personImportSec.getCompanycode());
                }
                if (company != null) {
                    if (company.getCompanyName().equals(personImportSec.getHomelaborleveldsc1())) {   //根据公司中文名，将新系统编码转为老系统编码
                        personImportSec.setHomelaborlevelnm1(company.getSyskeyOld());
                    }
                }
                for (Persontype persontype : persontypes) {
                    if (persontype.getPersontypeName().equals(personImportSec.getHomelaborleveldsc3())) {  //根据人员类别，将新系统编码转为老系统编码
                        personImportSec.setHomelaborlevelnm3(persontype.getSyscodeOld());
                    }
                }
                Department department = null;
                if (!personImportSec.getPkdept().isEmpty()) {
                    department = departmentService.findBySyskey_New(personImportSec.getPkdept());
                }
                if (department != null) {
                    if (department.getDeptName().equals(personImportSec.getHomelaborleveldsc2())) {
                        if (!StringUtils.isEmpty(department.getSyscodeOld())) {
                            if (department.getSyscodeOld().startsWith(personImportSec.getHomelaborlevelnm1())) {
                                personImportSec.setHomelaborlevelnm2(department.getSyscodeOld().split("_")[1]);
                            }
                        }
                    }
                }
                YonyouPersonImport yonyouPersonImport = null;
                yonyouPersonImport = yonyouPersonImportService.findByPersonnum(personImportSec.getPersonnum());
                if (yonyouPersonImport != null) {
                    BeanUtils.copyProperties(personImportSec, yonyouPersonImport, "hiredate", "birthday", "employmentstatusdt", "startworkdate", "employmentstatus");
                    if (!StringUtils.isEmpty(personImportSec.getHiredate())) {
                        yonyouPersonImport.setHiredate(sdf.parse(personImportSec.getHiredate()));
                    }
                    if (!StringUtils.isEmpty(personImportSec.getBirthday())) {
                        yonyouPersonImport.setBirthday(sdf.parse(personImportSec.getBirthday()));
                    }
                    if (!StringUtils.isEmpty(personImportSec.getEmploymentstatusdt())) {
                        yonyouPersonImport.setEmploymentstatusdt(sdf.parse(personImportSec.getEmploymentstatusdt()));
                    }
                    if (!StringUtils.isEmpty(personImportSec.getStartworkdate())) {
                        yonyouPersonImport.setStartworkdate(sdf.parse(personImportSec.getStartworkdate()));
                    }
                    yonyouPersonImport.setAttribute1(personImportSec.getBuName());
                    yonyouPersonImport.setAttribute3(personImportSec.getOutright());
                    yonyouPersonImport.setAttribute4(personImportSec.getCardfFlag());
                    yonyouPersonImport.setProcessFlag("0");
                }
            }

//            for (YonyouPersonImport yonyouPersonImport : yonyouPersonImportList) {
//                if ("0".equals(yonyouPersonImport.getProcessFlag())) {
//                    yonyouPersonImportService.update(yonyouPersonImport);
//                }
//            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("==========compareUpdate=========error=======");
            return false;
        }
        return flag;
    }

    private boolean insertNewPerson(List<YonyouPersonImportSec> yonyouPersonImportSecList, List<YonyouPersonImport> yonyouPersonImportList) {
        //获取所有工号，如果人事系统数据没有就插入
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean flag = false;
        try {
            Set<String> personNums = new HashSet<>(yonyouPersonImportList.size());
            for (YonyouPersonImport personImport : yonyouPersonImportList) {
                personNums.add(personImport.getPersonnum());
            }

            for (YonyouPersonImportSec importSec : yonyouPersonImportSecList) {
                if (!personNums.contains(importSec.getPersonnum())) {  //不包含
                    YonyouPersonImport yonyouPersonImport = new YonyouPersonImport();
                    BeanUtils.copyProperties(importSec, yonyouPersonImport, "hiredate", "birthday", "employmentstatusdt", "startworkdate");
                    if (!StringUtils.isEmpty(importSec.getHiredate())) {
                        yonyouPersonImport.setHiredate(sdf.parse(importSec.getHiredate()));
                    }
                    if (!StringUtils.isEmpty(importSec.getBirthday())) {
                        yonyouPersonImport.setBirthday(sdf.parse(importSec.getBirthday()));
                    }
                    if (!StringUtils.isEmpty(importSec.getEmploymentstatusdt())) {
                        yonyouPersonImport.setEmploymentstatusdt(sdf.parse(importSec.getEmploymentstatusdt()));
                    }
                    if (!StringUtils.isEmpty(importSec.getStartworkdate())) {
                        yonyouPersonImport.setStartworkdate(sdf.parse(importSec.getStartworkdate()));
                    }
                    yonyouPersonImport.setCreationDate(new Date());
                    yonyouPersonImport.setLastUpdateDate(new Date());
                    yonyouPersonImport.setProcessFlag("0");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("同步人员信息错误insertNewPerson方法");
            return flag;
        }
        return flag;
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
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("离职人员更新出错");
            return false;
        }
        return flag;
    }

    private boolean restoration(List<YonyouPersonImportSec> yonyouPersonImportSecList, List<YonyouPersonImport> yonyouPersonImportList) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean flag = true;
        try {
            for (YonyouPersonImportSec yonyouPersonImportSec : yonyouPersonImportSecList) {
                if (!StringUtils.isEmpty(yonyouPersonImportSec.getEmploymentstatus())) {
                    if ("Active".equals(yonyouPersonImportSec.getEmploymentstatus())) {
                        YonyouPersonImport yonyouPersonImport = yonyouPersonImportService.getYonyouPersonImportByPersonnumAndAndEmploymentstatus(yonyouPersonImportSec.getPersonnum(), "Terminated");
                        BeanUtils.copyProperties(yonyouPersonImportSec, yonyouPersonImport, "hiredate", "birthday", "employmentstatusdt", "startworkdate");
                        yonyouPersonImport.setHiredate(sdf.parse(yonyouPersonImportSec.getHiredate()));
                        yonyouPersonImport.setBirthday(sdf.parse(yonyouPersonImportSec.getBirthday()));
                        yonyouPersonImport.setEmploymentstatusdt(sdf.parse(yonyouPersonImportSec.getEmploymentstatusdt()));
                        yonyouPersonImport.setStartworkdate(sdf.parse(yonyouPersonImportSec.getStartworkdate()));
                        yonyouPersonImport.setProcessFlag("0");
                        yonyouPersonImport.setLastUpdateDate(new Date());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
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
        List<DepartmentSec> departmentSecList = departmentServiceSec.getDepartmentSecListByNC();//人事系统部门数据源头
        List<OfilmOrg> ofilmorgList = ofilmOrgService.findAll();//考勤系统组织数据
//        1.1 根据对照表修改数据源
        List<Department> departmentList = departmentService.findAll();//考勤系统对照部门数据

        //对照
        boolean flag3 = compareUpdateDepartment(departmentSecList, departmentList);

//        2:部门有变更则更新变更信息
        boolean flag = checkDeptmentInfo(departmentSecList, ofilmorgList);
//        3:部门封存的则把部门状态更新为失效
        boolean flag1 = effectiveUpdate(departmentSecList, ofilmorgList);
//        4:插入新增加的部门
        boolean flag2 = insertNewDeptment(departmentSecList, ofilmorgList);

        for (OfilmOrg ofilmOrg : ofilmorgList) {
            if ("0".equals(ofilmOrg.getProcessFlag())) {
                ofilmOrgService.update(ofilmOrg);
            }
        }
        if (flag && flag1 && flag2 && flag3) {
            return true;
        }
        logger.error("同步人员信息错误" + flag);
        logger.error("同步人员信息错误" + flag1);
        logger.error("同步人员信息错误" + flag2);
        return false;
    }

    private boolean compareUpdateDepartment(List<DepartmentSec> departmentSecList, List<Department> departmentList) {
//        List<Department> departments = departmentService.findAll();
        boolean flag = true;
        try {
            for (DepartmentSec deptmentsec : departmentSecList) {
                Department department = null;
                Department parentDepartment = null;
                if (!StringUtils.isEmpty(deptmentsec.getDeptcode())) {
                    department = departmentService.findBySyskey_New(deptmentsec.getDeptcode());
                }
                if (!StringUtils.isEmpty(deptmentsec.getfDeptcode())) {
                    parentDepartment = departmentService.findBySyskey_New(deptmentsec.getfDeptcode());
                }
                if (department != null) {
                    deptmentsec.setDeptcode(department.getSyscodeOld());
                }
                if (parentDepartment != null) {
                    deptmentsec.setfDeptcode(parentDepartment.getSyscodeOld());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return flag;
    }

    private boolean insertNewDeptment(List<DepartmentSec> departmentSecList, List<OfilmOrg> ofilmorgList) {
        //获取所有部门代码，如果人事系统的数据不在考勤系统的就插入考勤系统
        boolean flag = true;
        try {
            Set<String> deptmentCode = new HashSet<>(ofilmorgList.size());
            for (OfilmOrg ofilmorg : ofilmorgList) {
                deptmentCode.add(ofilmorg.getDeptCode());
            }
            for (DepartmentSec deptment : departmentSecList) {
                if ("ACTIVE".equals(deptment.getEffective()) && (!deptmentCode.contains(deptment.getDeptcode()))) {  //不包含
                    OfilmOrg ofilmOrg = new OfilmOrg();
                    BeanUtils.copyProperties(deptment, ofilmOrg);
                    ofilmOrg.setEffectiveDate(new Date());
                    ofilmOrg.setEffectiveStatus("EFFECTIVE");
                    ofilmOrg.setProcessFlag("0");
                    ofilmOrg.setCreationDate(new Date());
                }
            }
        } catch (Exception e) {
            logger.error("同步部门信息错误insertNewDeptment方法");
            return false;
        }
        return flag;
    }

    private boolean effectiveUpdate(List<DepartmentSec> departmentSecList, List<OfilmOrg> ofilmorgList) {
        boolean flag = true;
        try {
            Set<String> deptmentCode = new HashSet<>(departmentSecList.size());
            for (DepartmentSec deptment : departmentSecList) {
                deptmentCode.add(deptment.getDeptcode());
            }
            for (OfilmOrg ofilmorg : ofilmorgList) {
                if ("ACTIVE".equals(ofilmorg.getEffectiveStatus()) && !deptmentCode.contains(ofilmorg.getDeptCode())) {
                    ofilmorg.setLastUpdateDate(new Date());
                    ofilmorg.setEffectiveStatus("INACTIVE");
                    ofilmorg.setProcessFlag("0");
                }
            }
        } catch (Exception e) {
            logger.error("部门封存状态更新出错");
            return false;
        }
        return flag;
    }

    private boolean checkDeptmentInfo(List<DepartmentSec> departmentSecList, List<OfilmOrg> ofilmorgList) {
        boolean flag = true;
        try {
            for (DepartmentSec deptment : departmentSecList) {
                OfilmOrg ofilmorg = ofilmOrgService.findById(deptment.getDeptcode());
                if ((!ofilmorg.getDeptName().equals(deptment.getDeptname())) && (!ofilmorg.getEffectiveStatus().equals(deptment.getEffective())) && (!ofilmorg.getParentDeptCode().equals(deptment.getfDeptcode()))) {
                    ofilmorg.setEffectiveStatus(deptment.getEffective());
                    ofilmorg.setParentDeptCode(deptment.getfDeptcode());
                    ofilmorg.setDeptName(deptment.getDeptname());
                    ofilmorg.setLastUpdateDate(new Date());
                    ofilmorg.setEffectiveStatus(deptment.getEffective());
                    ofilmorg.setProcessFlag("0");
                }
            }
        } catch (Exception e) {
            logger.error("部门信息状态更新出错");
            return false;
        }
        return flag;
    }

}
