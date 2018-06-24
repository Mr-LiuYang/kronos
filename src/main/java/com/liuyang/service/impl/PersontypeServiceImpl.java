package com.liuyang.service.impl;

import com.liuyang.entity.Persontype;
import com.liuyang.entity.PersontypeRepository;
import com.liuyang.service.PersontypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
@Service
@Transactional("firstTransactionManager")
public class PersontypeServiceImpl implements PersontypeService {
    @Autowired
    private PersontypeRepository persontypeRepository;
    @Override
    public List<Persontype> findAll() {
        return persontypeRepository.findAll();
    }

    @Override
    public Persontype insert(Persontype persontype) {
        return persontypeRepository.save(persontype);
    }

    @Override
    public Persontype update(Persontype persontype) {
        return persontypeRepository.save(persontype);
    }

    @Override
    public Persontype findById(String Syscode_old) {
        return persontypeRepository.getPersontypeBySyscodeOld(Syscode_old);
    }
}
