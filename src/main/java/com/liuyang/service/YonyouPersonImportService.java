package com.liuyang.service;

import com.liuyang.entity.YonyouPersonImport;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
public interface YonyouPersonImportService {


    /**
     * 获取所有 YonyouPersonImport
     */
    List<YonyouPersonImport> findAll();

    /**
     * 新增 YonyouPersonImport
     *
     * @param YonyouPersonImport {@link YonyouPersonImport}
     */
    YonyouPersonImport insert(YonyouPersonImport YonyouPersonImport);

    /**
     * 更新 YonyouPersonImport
     *
     * @param YonyouPersonImport {@link YonyouPersonImport}
     */
    YonyouPersonImport update(YonyouPersonImport YonyouPersonImport);


    /**
     * 获取 YonyouPersonImport
     *
     * @param id 编号
     */
    YonyouPersonImport findByPersonnum(String id);


    YonyouPersonImport getYonyouPersonImportByPersonnumAndAndEmploymentstatus(String personnum, String terminated);
}
