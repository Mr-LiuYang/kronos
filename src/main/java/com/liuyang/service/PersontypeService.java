package com.liuyang.service;

import com.liuyang.entity.Persontype;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
public interface PersontypeService {
    /**
     * 获取所有 Persontype
     */
    List<Persontype> findAll();

    /**
     * 新增 Persontype
     *
     * @param Persontype {@link Persontype}
     */
    Persontype insert(Persontype Persontype);

    /**
     * 更新 Persontype
     *
     * @param Persontype {@link Persontype}
     */
    Persontype update(Persontype Persontype);


    /**
     * 获取 Persontype
     *
     * @param id 编号
     */
    Persontype findById(String id);
}
