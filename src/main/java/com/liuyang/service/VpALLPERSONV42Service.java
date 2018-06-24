package com.liuyang.service;

import com.liuyang.entity.VpALLPERSONV42;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
public interface VpALLPERSONV42Service {
    /**
     * 获取所有 VpALLPERSONV42
     */
    List<VpALLPERSONV42> findAll();

    /**
     * 新增 VpALLPERSONV42
     *
     * @param VpALLPERSONV42 {@link VpALLPERSONV42}
     */
    VpALLPERSONV42 insert(VpALLPERSONV42 VpALLPERSONV42);

    /**
     * 更新 VpALLPERSONV42
     *
     * @param VpALLPERSONV42 {@link VpALLPERSONV42}
     */
    VpALLPERSONV42 update(VpALLPERSONV42 VpALLPERSONV42);


}
