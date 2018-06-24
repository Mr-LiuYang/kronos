package com.liuyang.service;

import com.liuyang.entity.Department;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
public interface DepartmentService {

    /**
     * 获取所有 Department
     */
    List<Department> findAll();

    /**
     * 新增 Department
     *
     * @param Department {@link Department}
     */
    Department insert(Department Department);

    /**
     * 更新 Department
     *
     * @param Department {@link Department}
     */
    Department update(Department Department);


    /**
     * 获取 Department
     *
     * @param id 编号
     */
    Department findBySyskey_old(String syskey_old);
}
