package com.liuyang.service.impl;


import com.liuyang.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by liuyang on 2018/6/24
 * 同步人事信息
 */
@Service
@Transactional("firstTransactionManager")
public class InformationSyncServiceImpl implements InformationSyncService {

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


    /**
     * @return 人员信息是否同步成功
     * 同步人员信息
     */
    @Override
    @Transactional
    public boolean personInfoSync() {
//        1:从NC数据库获取人员信息
//        2:检查每个字段，看是否有更新
//          把有修改的数据行更新为修改后的值，并把标志位置为未读(在职人员)l_HOMELABORLEVELDSC3 in('员工', '职员', '其他人员')
//          把有修改的数据行更新为修改后的值，并把标志位置为未读(非在职及其他人员不更新人员类别)
//        3:把有离职后复职的人员信息同步,并把状态切换时间跟新为离职日期后一天
//        4:把离职人员的状态更新为离职
//        5:把新入职的人员信息插入到表中

        return false;
    }

    /**
     * @return 部门信息是否同步成功
     * 同步部门信息
     */
    @Override
    @Transactional
    public boolean deptmentInfoSync() {
//        1:把NC数据库获取部门信息
//        2:部门有变更则更新变更信息
//        3:部门封存的则把部门状态更新为失效
//        4:插入新增加的部门
        return false;
    }
}
