package com.liuyang.service;

import com.liuyang.entity.OfilmOrg;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
public interface OfilmOrgService {
    /**
     * 获取所有 OfilmOrg
     */
    List<OfilmOrg> findAll();

    /**
     * 新增 OfilmOrg
     *
     * @param OfilmOrg {@link OfilmOrg}
     */
    OfilmOrg insert(OfilmOrg OfilmOrg);

    /**
     * 更新 OfilmOrg
     *
     * @param OfilmOrg {@link OfilmOrg}
     */
    OfilmOrg update(OfilmOrg OfilmOrg);


    /**
     * 获取 OfilmOrg
     *
     * @param id 编号
     */
    OfilmOrg findById(String id);
}
