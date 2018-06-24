package com.liuyang.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by liuyang on 2018/6/24
 */
@Repository
public interface PersontypeRepository extends JpaRepository<Persontype,String> {
    Persontype getPersontypeBySyscodeOld(@Param("Syscode_old") String Syscode_old);
}
