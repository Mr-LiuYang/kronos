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

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


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
        compareUpdate(yonyouPersonImportSecList);
        List<YonyouPersonImport> yonyouPersonImportList = yonyouPersonImportService.findAll();//考勤系统人事数据
//        2:检查每个字段，看是否有更新
        boolean flag = checkPersonInfo(yonyouPersonImportSecList, yonyouPersonImportList);
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

    private void compareUpdate(List<YonyouPersonImportSec> yonyouPersonImportSecList) {
        List<Company> companies = companyService.findAll();
        List<Job> jobs = jobService.findAll();
        List<Persontype> persontypes = persontypeService.findAll();
        List<Department> departments = departmentService.findAll();

        for (YonyouPersonImportSec personImportSec: yonyouPersonImportSecList) {
            personImportSec.getHomelaborleveldsc1();

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
                    YonyouPersonImport yonyouPersonImport = new YonyouPersonImport();//日期属性修改
                    BeanUtils.copyProperties(importSec, yonyouPersonImport);
                    yonyouPersonImportService.insert(yonyouPersonImport);
                }
            }
        } catch (Exception e) {
            logger.error("同步人员信息错误insertNewPerson方法");
            return flag;
        }
        return flag;
    }

    private boolean quitUpdate(List<YonyouPersonImportSec> yonyouPersonImportSecList, List<YonyouPersonImport> yonyouPersonImportList) {
        boolean flag = false;


        return flag;
    }

    private boolean restoration(List<YonyouPersonImportSec> yonyouPersonImportSecList, List<YonyouPersonImport> yonyouPersonImportList) {
        boolean flag = false;


        return flag;
    }

    private boolean checkPersonInfo(List<YonyouPersonImportSec> yonyouPersonImportSecList, List<YonyouPersonImport> yonyouPersonImportList) {
        boolean flag = false;
//          把有修改的数据行更新为修改后的值，并把标志位置为未读(在职人员)l_HOMELABORLEVELDSC3 in('员工', '职员', '其他人员')
//          把有修改的数据行更新为修改后的值，并把标志位置为未读(非在职及其他人员不更新人员类别)
        for (YonyouPersonImportSec personSec : yonyouPersonImportSecList) {

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
