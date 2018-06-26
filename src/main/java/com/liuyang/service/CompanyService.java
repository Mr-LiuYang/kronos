package com.liuyang.service;

import com.liuyang.entity.Company;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
public interface CompanyService {

    /**
     * 获取所有 Company
     */
    List<Company> findAll();

    /**
     * 新增 Company
     *
     * @param Company {@link Company}
     */
    Company insert(Company Company);

    /**
     * 更新 Company
     *
     * @param Company {@link Company}
     */
    Company update(Company Company);


    /**
     * 获取 Company
     *
     * @param id 编号
     */
    Company findBySyskey_New(String id);
}
