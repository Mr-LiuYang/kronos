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


//    @Query(value = "select rtrim(E.\"PERSONNUM\") personnum, rtrim(E.\"PERSONFULLNAME\") personfullname, rtrim(E.\"HOMELABORLEVELNM2\")homelaborlevelnm2, rtrim(E.\"HOMELABORLEVELDSC2\")homelaborleveldsc2,to_date(E.\"HIREDATE\", 'yyyy-mm-dd')hiredate, rtrim(E.\"WORKPROCEDD\")workprocedd, rtrim(E.\"WORKSTATION\")workstation,rtrim(E.\"HOMELABORLEVELDSC3\")homelaborleveldsc3, rtrim(E.\"FIRSTORDERPOST\")firstorderpost, rtrim(E.\"SECONDORDERPOST\")secondorderpost, rtrim(E.\"HOMELABORLEVELDSC5\")homelaborleveldsc5,rtrim(E.\"POSITION\")position, rtrim(E.\"RANKS\")ranks, to_date(E.\"BIRTHDAY\", 'yyyy-mm-dd')birthday, E.\"sex\" sex, rtrim(E.\"HOMELABORLEVELNM1\")homelaborlevelnm1,rtrim(E.\"HOMELABORLEVELDSC1\")homelaborleveldsc1, rtrim(E.\"MARITALSTATUS\")maritalstatus, rtrim(E.\"PERSONNELCLASSFICATION\")personnelclassfication,rtrim(E.\"EMPLOYMENTSTATUS\")employmentstatus, rtrim(E.\"QUITTYPE\")quittype, to_date(E.\"EMPLOYMENTSTATUSDT\", 'yyyy-mm-dd')employmentstatusdt,to_date(E.\"STARTWORKDATE\", 'yyyy-mm-dd')startworkdate, rtrim(E.\"HOMECOUNTRY\")homecountry, trim(E.\"email\")workemailaddress, trim(E.\"HOMELABORLEVELNM5\")homelaborlevelnm5,trim(E.\"HOMELABORLEVELNM3\")homelaborlevelnm3, trim(E.\"SPECIAL_FLAG\")specialFlag, rtrim(E.\"BU_CODE\")buCode, rtrim(E.\"if_eicc\")ifEicc, rtrim(E.\"BU_NAME\")attribute1,rtrim(E.\"OUTRIGHT\"), rtrim(E.\"CARD_FLAG\") from EmpInfo_Kronos_V@nchr E\n", nativeQuery = true)
    @Query(value = "select PERSONNUM as personnum from EmpInfo_Kronos_V@nchr ", nativeQuery = true)
    List<YonyouPersonImport> getListByNC();
}
