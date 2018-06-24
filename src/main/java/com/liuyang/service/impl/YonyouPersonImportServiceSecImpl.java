package com.liuyang.service.impl;

import com.liuyang.entity.YonyouPersonImport;
import com.liuyang.entity.YonyouPersonImportRepository;
import com.liuyang.entitySec.YonyouPersonImportRepositorySec;
import com.liuyang.entitySec.YonyouPersonImportSec;
import com.liuyang.service.YonyouPersonImportService;
import com.liuyang.service.YonyouPersonImportServiceSec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
@Service
@Transactional("secondTransactionManager")
public class YonyouPersonImportServiceSecImpl implements YonyouPersonImportServiceSec {
    @Autowired
   private YonyouPersonImportRepositorySec personImportRepository;



    @Override
    public List<YonyouPersonImportSec> getListByNC() {
        return personImportRepository.findAll();
    }

}
