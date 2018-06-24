package com.liuyang.service;

import com.liuyang.entity.Job;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
public interface JobService {
    /**
     * 获取所有 Job
     */
    List<Job> findAll();

    /**
     * 新增 Job
     *
     * @param Job {@link Job}
     */
    Job insert(Job Job);

    /**
     * 更新 Job
     *
     * @param Job {@link Job}
     */
    Job update(Job Job);


    /**
     * 获取 Job
     *
     * @param id 编号
     */
    Job findById(String id);
}
