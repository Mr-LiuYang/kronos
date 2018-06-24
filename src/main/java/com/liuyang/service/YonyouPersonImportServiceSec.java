package com.liuyang.service;

import com.liuyang.entity.YonyouPersonImport;
import com.liuyang.entitySec.YonyouPersonImportSec;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
public interface YonyouPersonImportServiceSec {
    /**
     * 人事系统获取 YonyouPersonImport
     */
    List<YonyouPersonImportSec> getListByNC();
}
