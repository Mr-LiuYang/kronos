package com.liuyang.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by liuyang on 2018/6/24
 */
@Repository
public interface CompanyRepository extends JpaRepository<Company,String> {
    Company getCompanyBySyscodeNew(String SyscodeNew);
}
