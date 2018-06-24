package com.liuyang.service.impl;

import com.liuyang.entity.Department;
import com.liuyang.entity.DepartmentRepository;
import com.liuyang.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
@Service
@Transactional("firstTransactionManager")
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department insert(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department update(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department findBySyskey_old(String syskey_old) {
        return departmentRepository.getDepartmentBySyscodeOld(syskey_old);
    }


}
