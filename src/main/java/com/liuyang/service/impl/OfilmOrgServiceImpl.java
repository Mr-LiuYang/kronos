package com.liuyang.service.impl;

import com.liuyang.entity.JobRepository;
import com.liuyang.entity.OfilmOrg;
import com.liuyang.entity.OfilmOrgRepository;
import com.liuyang.service.OfilmOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
@Service
@Transactional("firstTransactionManager")
public class OfilmOrgServiceImpl implements OfilmOrgService {
    @Autowired
    private OfilmOrgRepository ofilmOrgRepository;
    @Override
    public List<OfilmOrg> findAll() {
        return ofilmOrgRepository.findAll();
    }

    @Override
    public OfilmOrg insert(OfilmOrg ofilmOrg) {
        return ofilmOrgRepository.save(ofilmOrg);
    }

    @Override
    public OfilmOrg update(OfilmOrg ofilmOrg) {
        return ofilmOrgRepository.save(ofilmOrg);
    }

    @Override
    public OfilmOrg findById(String Dept_code) {
        return ofilmOrgRepository.getOfilmOrgByDeptCode(Dept_code);
    }
}
