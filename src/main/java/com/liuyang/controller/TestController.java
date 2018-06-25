package com.liuyang.controller;

import com.liuyang.entity.*;
import com.liuyang.entitySec.DepartmentSec;
import com.liuyang.entitySec.YonyouPersonImportSec;
import com.liuyang.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
@RequestMapping(value = "/liuyang")
@RestController
public class TestController {
    //    @Autowired
//    JobService jobService;
//    @Autowired
//    CompanyService companyService;
//    @Autowired
//    DepartmentService departmentService;
//    @Autowired
//    OfilmOrgService ofilmOrgService;
//    @Autowired
//    PersontypeService persontypeService;
//    @Autowired
//    VpALLPERSONV42Service vpALLPERSONV42Service;
//    @Autowired
//    YonyouPersonImportService yonyouPersonImportService;
//    @Autowired
//    YonyouPersonImportServiceSec yonyouPersonImportServiceSec;
    @Autowired
    DepartmentServiceSec departmentServiceSec;
    @Autowired
    InformationSyncService informationSyncService;

//    @RequestMapping(method = RequestMethod.GET, value = "/job")
//    public List<Job> getJobList() {
//        return jobService.findAll();
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/company")
//    public List<Company> getCompanyList() {
//        return companyService.findAll();
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/department")
//    public List<Department> getDepartmentList() {
//        return departmentService.findAll();
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/ofilmOrg")
//    public List<OfilmOrg> getOfilmOrgList() {
//        return ofilmOrgService.findAll();
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/persontype")
//    public List<Persontype> getPersontypeList() {
//        return persontypeService.findAll();
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/vpALLPERSONV42")
//    public List<VpALLPERSONV42> getVpALLPERSONV42List() {
//        return vpALLPERSONV42Service.findAll();
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/yonyouPersonImport")
//    public List<YonyouPersonImport> getYonyouPersonImportList() {
//        List<YonyouPersonImport> list = yonyouPersonImportService.findAll();
//        return list;
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/personByNc")
//    public List<YonyouPersonImportSec> getYonyouPersonImportListByNC() {
//        List<YonyouPersonImportSec> list = yonyouPersonImportServiceSec.getListByNC();
//        return list;
//    }
//
    @RequestMapping(method = RequestMethod.GET, value = "/deptByNc")
    public List<DepartmentSec> getDepartmentSecListByNC() {
        List<DepartmentSec> list = departmentServiceSec.getDepartmentSecListByNC();
        return list;
    }

    //同步人事数据到考勤系统
    @RequestMapping(method = RequestMethod.GET, value = "/personInfoSync")
    public boolean personInfoSync() {
        return informationSyncService.personInfoSync();
    }

    //同步部门数据到考勤系统
    @RequestMapping(method = RequestMethod.GET, value = "/deptmentInfoSync")
    public boolean deptmentInfoSync() {
        return informationSyncService.deptmentInfoSync();
    }
}
