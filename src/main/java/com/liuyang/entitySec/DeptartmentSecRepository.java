package com.liuyang.entitySec;

import com.liuyang.entitySec.DepartmentSec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by liuyang on 2018/6/24
 */
@Repository
public interface DeptartmentSecRepository extends JpaRepository<DepartmentSec,String> {

}
