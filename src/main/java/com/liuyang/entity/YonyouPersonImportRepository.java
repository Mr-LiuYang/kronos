package com.liuyang.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuyang on 2018/6/24
 */
@Repository
public interface YonyouPersonImportRepository extends JpaRepository<YonyouPersonImport,String> {

    YonyouPersonImport getYonyouPersonImportByPersonnum(@Param("personnum") String personnum);

    YonyouPersonImport getYonyouPersonImportByPersonnumAndAndEmploymentstatus(String personnum,String status);
}
