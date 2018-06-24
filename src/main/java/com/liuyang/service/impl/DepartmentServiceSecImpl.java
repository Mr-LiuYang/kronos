package com.liuyang.service.impl;

import com.liuyang.entitySec.DepartmentSec;
import com.liuyang.entitySec.DeptartmentSecRepository;
import com.liuyang.service.DepartmentServiceSec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
@Service
@Transactional("secondTransactionManager")
public class DepartmentServiceSecImpl implements DepartmentServiceSec{

    @Autowired
    private DeptartmentSecRepository deptartmentSecRepository;
    @Override
    public List<DepartmentSec> getDepartmentSecListByNC() {
        return deptartmentSecRepository.findAll();
    }
}
