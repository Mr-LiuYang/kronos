package com.liuyang.service.impl;

import com.liuyang.entity.Job;
import com.liuyang.entity.JobRepository;
import com.liuyang.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
@Service
@Transactional("firstTransactionManager")
public class JobServiceImpl implements JobService {
    @Autowired
    private JobRepository jobRepository;
    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    @Transactional
    public Job insert(Job job) {
        return jobRepository.save(job);
    }

    @Override
    @Transactional
    public Job update(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public Job findById(String Syscode_old) {
        return jobRepository.getJobBySyscodeOld(Syscode_old);
    }
}
