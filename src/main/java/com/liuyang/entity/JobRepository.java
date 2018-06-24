package com.liuyang.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by liuyang on 2018/6/24
 */

@Repository
public interface JobRepository extends JpaRepository<Job,String> {
    Job getJobBySyscodeOld(String syscode_old);
}
