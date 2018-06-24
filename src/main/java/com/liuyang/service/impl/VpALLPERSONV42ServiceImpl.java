package com.liuyang.service.impl;

import com.liuyang.entity.VpALLPERSONV42;
import com.liuyang.entity.VpALLPERSONV42Repository;
import com.liuyang.service.VpALLPERSONV42Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
@Service
@Transactional("firstTransactionManager")
public class VpALLPERSONV42ServiceImpl implements VpALLPERSONV42Service {
    @Autowired
    private VpALLPERSONV42Repository repository;

    @Override
    public List<VpALLPERSONV42> findAll() {
        return repository.findAll();
    }

    @Override
    public VpALLPERSONV42 insert(VpALLPERSONV42 vpALLPERSONV42) {
        return repository.save(vpALLPERSONV42);
    }

    @Override
    public VpALLPERSONV42 update(VpALLPERSONV42 vpALLPERSONV42) {
        return repository.save(vpALLPERSONV42);
    }

}
