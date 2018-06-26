package com.liuyang.service.impl;

import com.liuyang.entity.YonyouPersonImport;
import com.liuyang.entity.YonyouPersonImportRepository;
import com.liuyang.service.YonyouPersonImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
@Service
@Transactional("firstTransactionManager")
public class YonyouPersonImportServiceImpl implements YonyouPersonImportService {
    @Autowired
   private YonyouPersonImportRepository personImportRepository;

    @Override
    public List<YonyouPersonImport> findAll() {
        return personImportRepository.findAll();
    }

    @Override
    public YonyouPersonImport insert(YonyouPersonImport yonyouPersonImport) {
        return personImportRepository.save(yonyouPersonImport);
    }

    @Override
    public YonyouPersonImport update(YonyouPersonImport yonyouPersonImport) {
        return personImportRepository.save(yonyouPersonImport);
    }

    @Override
    public YonyouPersonImport findByPersonnum(String id) {
        return personImportRepository.getYonyouPersonImportByPersonnum(id);
    }

    @Override
    public YonyouPersonImport getYonyouPersonImportByPersonnumAndAndEmploymentstatus(String personnum, String terminated) {
        return personImportRepository.getYonyouPersonImportByPersonnumAndAndEmploymentstatus(personnum,terminated);
    }


}
