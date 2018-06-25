package com.liuyang.service;

import com.liuyang.entitySec.DepartmentSec;
import com.liuyang.entitySec.YonyouPersonImportSec;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
public interface DepartmentServiceSec {
    /**
     * 人事系统获取 部门信息
     */
    List<DepartmentSec> getDepartmentSecListByNC();
}
