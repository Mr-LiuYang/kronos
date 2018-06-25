package com.liuyang.entitySec;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * Created by liuyang on 2018/6/24
 */
@Entity
@Table(name = "EmpInfo_Kronos_V")
public class YonyouPersonImportSec implements Serializable {
    @Id
    @Column
    private String personnum;
    @Column
    private String personfullname;
    @Column
    private String homelaborlevelnm2;
    @Column
    private String homelaborleveldsc2;
    @Column(name = "hiredate")
    private String hiredate1;
    private Date hiredate;
    @Column
    private String workprocedd;
    @Column
    private String workstation;
    @Column
    private String homelaborleveldsc3;
    @Column
    private String firstorderpost;
    @Column
    private String secondorderpost;
    @Column
    private String homelaborleveldsc5;
    @Column
    private String position;
    @Column
    private String ranks;
    @Column(name = "birthday")
    private String birthday1;
    private Date birthday;
    @Column
    private String sex;
    @Column
    private String homelaborlevelnm1;
    @Column
    private String homelaborleveldsc1;
    @Column
    private String maritalstatus;
    @Column
    private String personnelclassfication;
    @Column
    private String employmentstatus;
    @Column
    private String quittype;
    @Column(name = "employmentstatusdt")
    private String employmentstatusdt1;
    private Date employmentstatusdt;
    @Column(name = "startworkdate")
    private String startworkdate1;
    private Date startworkdate;
    @Column
    private String homecountry;
    @Column
    private String email;
    @Column
    private String homelaborlevelnm5;
    @Column
    private String homelaborlevelnm3;
    @Column(name = "special_flag")
    private String specialFlag;
    @Column(name = "bu_code")
    private String buCode;
    @Column(name = "if_eicc")
    private String ifEicc;
    @Column(name = "bu_name")
    private String buName;
    @Column
    private String outright;
    @Column(name = "card_flag")
    private String cardfFlag;


    public YonyouPersonImportSec() {
    }

    @Override
    public String toString() {
        return "YonyouPersonImportSec{" +
                "personnum='" + personnum + '\'' +
                ", personfullname='" + personfullname + '\'' +
                ", homelaborlevelnm2='" + homelaborlevelnm2 + '\'' +
                ", homelaborleveldsc2='" + homelaborleveldsc2 + '\'' +
                ", hiredate1='" + hiredate1 + '\'' +
                ", hiredate=" + hiredate +
                ", workprocedd='" + workprocedd + '\'' +
                ", workstation='" + workstation + '\'' +
                ", homelaborleveldsc3='" + homelaborleveldsc3 + '\'' +
                ", firstorderpost='" + firstorderpost + '\'' +
                ", secondorderpost='" + secondorderpost + '\'' +
                ", homelaborleveldsc5='" + homelaborleveldsc5 + '\'' +
                ", position='" + position + '\'' +
                ", ranks='" + ranks + '\'' +
                ", birthday1='" + birthday1 + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", homelaborlevelnm1='" + homelaborlevelnm1 + '\'' +
                ", homelaborleveldsc1='" + homelaborleveldsc1 + '\'' +
                ", maritalstatus='" + maritalstatus + '\'' +
                ", personnelclassfication='" + personnelclassfication + '\'' +
                ", employmentstatus='" + employmentstatus + '\'' +
                ", quittype='" + quittype + '\'' +
                ", employmentstatusdt1='" + employmentstatusdt1 + '\'' +
                ", employmentstatusdt=" + employmentstatusdt +
                ", startworkdate1='" + startworkdate1 + '\'' +
                ", startworkdate=" + startworkdate +
                ", homecountry='" + homecountry + '\'' +
                ", email='" + email + '\'' +
                ", homelaborlevelnm5='" + homelaborlevelnm5 + '\'' +
                ", homelaborlevelnm3='" + homelaborlevelnm3 + '\'' +
                ", specialFlag='" + specialFlag + '\'' +
                ", buCode='" + buCode + '\'' +
                ", ifEicc='" + ifEicc + '\'' +
                ", buName='" + buName + '\'' +
                ", outright='" + outright + '\'' +
                ", cardfFlag='" + cardfFlag + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YonyouPersonImportSec that = (YonyouPersonImportSec) o;

        if (personnum != null ? !personnum.equals(that.personnum) : that.personnum != null) return false;
        if (personfullname != null ? !personfullname.equals(that.personfullname) : that.personfullname != null)
            return false;
        if (homelaborlevelnm2 != null ? !homelaborlevelnm2.equals(that.homelaborlevelnm2) : that.homelaborlevelnm2 != null)
            return false;
        if (homelaborleveldsc2 != null ? !homelaborleveldsc2.equals(that.homelaborleveldsc2) : that.homelaborleveldsc2 != null)
            return false;
        if (hiredate1 != null ? !hiredate1.equals(that.hiredate1) : that.hiredate1 != null) return false;
        if (hiredate != null ? !hiredate.equals(that.hiredate) : that.hiredate != null) return false;
        if (workprocedd != null ? !workprocedd.equals(that.workprocedd) : that.workprocedd != null) return false;
        if (workstation != null ? !workstation.equals(that.workstation) : that.workstation != null) return false;
        if (homelaborleveldsc3 != null ? !homelaborleveldsc3.equals(that.homelaborleveldsc3) : that.homelaborleveldsc3 != null)
            return false;
        if (firstorderpost != null ? !firstorderpost.equals(that.firstorderpost) : that.firstorderpost != null)
            return false;
        if (secondorderpost != null ? !secondorderpost.equals(that.secondorderpost) : that.secondorderpost != null)
            return false;
        if (homelaborleveldsc5 != null ? !homelaborleveldsc5.equals(that.homelaborleveldsc5) : that.homelaborleveldsc5 != null)
            return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (ranks != null ? !ranks.equals(that.ranks) : that.ranks != null) return false;
        if (birthday1 != null ? !birthday1.equals(that.birthday1) : that.birthday1 != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (homelaborlevelnm1 != null ? !homelaborlevelnm1.equals(that.homelaborlevelnm1) : that.homelaborlevelnm1 != null)
            return false;
        if (homelaborleveldsc1 != null ? !homelaborleveldsc1.equals(that.homelaborleveldsc1) : that.homelaborleveldsc1 != null)
            return false;
        if (maritalstatus != null ? !maritalstatus.equals(that.maritalstatus) : that.maritalstatus != null)
            return false;
        if (personnelclassfication != null ? !personnelclassfication.equals(that.personnelclassfication) : that.personnelclassfication != null)
            return false;
        if (employmentstatus != null ? !employmentstatus.equals(that.employmentstatus) : that.employmentstatus != null)
            return false;
        if (quittype != null ? !quittype.equals(that.quittype) : that.quittype != null) return false;
        if (employmentstatusdt1 != null ? !employmentstatusdt1.equals(that.employmentstatusdt1) : that.employmentstatusdt1 != null)
            return false;
        if (employmentstatusdt != null ? !employmentstatusdt.equals(that.employmentstatusdt) : that.employmentstatusdt != null)
            return false;
        if (startworkdate1 != null ? !startworkdate1.equals(that.startworkdate1) : that.startworkdate1 != null)
            return false;
        if (startworkdate != null ? !startworkdate.equals(that.startworkdate) : that.startworkdate != null)
            return false;
        if (homecountry != null ? !homecountry.equals(that.homecountry) : that.homecountry != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (homelaborlevelnm5 != null ? !homelaborlevelnm5.equals(that.homelaborlevelnm5) : that.homelaborlevelnm5 != null)
            return false;
        if (homelaborlevelnm3 != null ? !homelaborlevelnm3.equals(that.homelaborlevelnm3) : that.homelaborlevelnm3 != null)
            return false;
        if (specialFlag != null ? !specialFlag.equals(that.specialFlag) : that.specialFlag != null) return false;
        if (buCode != null ? !buCode.equals(that.buCode) : that.buCode != null) return false;
        if (ifEicc != null ? !ifEicc.equals(that.ifEicc) : that.ifEicc != null) return false;
        if (buName != null ? !buName.equals(that.buName) : that.buName != null) return false;
        if (outright != null ? !outright.equals(that.outright) : that.outright != null) return false;
        return cardfFlag != null ? cardfFlag.equals(that.cardfFlag) : that.cardfFlag == null;
    }

    @Override
    public int hashCode() {
        int result = personnum != null ? personnum.hashCode() : 0;
        result = 31 * result + (personfullname != null ? personfullname.hashCode() : 0);
        result = 31 * result + (homelaborlevelnm2 != null ? homelaborlevelnm2.hashCode() : 0);
        result = 31 * result + (homelaborleveldsc2 != null ? homelaborleveldsc2.hashCode() : 0);
        result = 31 * result + (hiredate1 != null ? hiredate1.hashCode() : 0);
        result = 31 * result + (hiredate != null ? hiredate.hashCode() : 0);
        result = 31 * result + (workprocedd != null ? workprocedd.hashCode() : 0);
        result = 31 * result + (workstation != null ? workstation.hashCode() : 0);
        result = 31 * result + (homelaborleveldsc3 != null ? homelaborleveldsc3.hashCode() : 0);
        result = 31 * result + (firstorderpost != null ? firstorderpost.hashCode() : 0);
        result = 31 * result + (secondorderpost != null ? secondorderpost.hashCode() : 0);
        result = 31 * result + (homelaborleveldsc5 != null ? homelaborleveldsc5.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (ranks != null ? ranks.hashCode() : 0);
        result = 31 * result + (birthday1 != null ? birthday1.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (homelaborlevelnm1 != null ? homelaborlevelnm1.hashCode() : 0);
        result = 31 * result + (homelaborleveldsc1 != null ? homelaborleveldsc1.hashCode() : 0);
        result = 31 * result + (maritalstatus != null ? maritalstatus.hashCode() : 0);
        result = 31 * result + (personnelclassfication != null ? personnelclassfication.hashCode() : 0);
        result = 31 * result + (employmentstatus != null ? employmentstatus.hashCode() : 0);
        result = 31 * result + (quittype != null ? quittype.hashCode() : 0);
        result = 31 * result + (employmentstatusdt1 != null ? employmentstatusdt1.hashCode() : 0);
        result = 31 * result + (employmentstatusdt != null ? employmentstatusdt.hashCode() : 0);
        result = 31 * result + (startworkdate1 != null ? startworkdate1.hashCode() : 0);
        result = 31 * result + (startworkdate != null ? startworkdate.hashCode() : 0);
        result = 31 * result + (homecountry != null ? homecountry.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (homelaborlevelnm5 != null ? homelaborlevelnm5.hashCode() : 0);
        result = 31 * result + (homelaborlevelnm3 != null ? homelaborlevelnm3.hashCode() : 0);
        result = 31 * result + (specialFlag != null ? specialFlag.hashCode() : 0);
        result = 31 * result + (buCode != null ? buCode.hashCode() : 0);
        result = 31 * result + (ifEicc != null ? ifEicc.hashCode() : 0);
        result = 31 * result + (buName != null ? buName.hashCode() : 0);
        result = 31 * result + (outright != null ? outright.hashCode() : 0);
        result = 31 * result + (cardfFlag != null ? cardfFlag.hashCode() : 0);
        return result;
    }

    public String getPersonnum() {
        return personnum;
    }

    public void setPersonnum(String personnum) {
        this.personnum = personnum;
    }

    public String getPersonfullname() {
        return personfullname;
    }

    public void setPersonfullname(String personfullname) {
        this.personfullname = personfullname;
    }

    public String getHomelaborlevelnm2() {
        return homelaborlevelnm2;
    }

    public void setHomelaborlevelnm2(String homelaborlevelnm2) {
        this.homelaborlevelnm2 = homelaborlevelnm2;
    }

    public String getHomelaborleveldsc2() {
        return homelaborleveldsc2;
    }

    public void setHomelaborleveldsc2(String homelaborleveldsc2) {
        this.homelaborleveldsc2 = homelaborleveldsc2;
    }

    public String getHiredate1() {
        return hiredate1;
    }

    public void setHiredate1(String hiredate1) {
        this.hiredate1 = hiredate1;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getWorkprocedd() {
        return workprocedd;
    }

    public void setWorkprocedd(String workprocedd) {
        this.workprocedd = workprocedd;
    }

    public String getWorkstation() {
        return workstation;
    }

    public void setWorkstation(String workstation) {
        this.workstation = workstation;
    }

    public String getHomelaborleveldsc3() {
        return homelaborleveldsc3;
    }

    public void setHomelaborleveldsc3(String homelaborleveldsc3) {
        this.homelaborleveldsc3 = homelaborleveldsc3;
    }

    public String getFirstorderpost() {
        return firstorderpost;
    }

    public void setFirstorderpost(String firstorderpost) {
        this.firstorderpost = firstorderpost;
    }

    public String getSecondorderpost() {
        return secondorderpost;
    }

    public void setSecondorderpost(String secondorderpost) {
        this.secondorderpost = secondorderpost;
    }

    public String getHomelaborleveldsc5() {
        return homelaborleveldsc5;
    }

    public void setHomelaborleveldsc5(String homelaborleveldsc5) {
        this.homelaborleveldsc5 = homelaborleveldsc5;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRanks() {
        return ranks;
    }

    public void setRanks(String ranks) {
        this.ranks = ranks;
    }

    public String getBirthday1() {
        return birthday1;
    }

    public void setBirthday1(String birthday1) {
        this.birthday1 = birthday1;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHomelaborlevelnm1() {
        return homelaborlevelnm1;
    }

    public void setHomelaborlevelnm1(String homelaborlevelnm1) {
        this.homelaborlevelnm1 = homelaborlevelnm1;
    }

    public String getHomelaborleveldsc1() {
        return homelaborleveldsc1;
    }

    public void setHomelaborleveldsc1(String homelaborleveldsc1) {
        this.homelaborleveldsc1 = homelaborleveldsc1;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getPersonnelclassfication() {
        return personnelclassfication;
    }

    public void setPersonnelclassfication(String personnelclassfication) {
        this.personnelclassfication = personnelclassfication;
    }

    public String getEmploymentstatus() {
        return employmentstatus;
    }

    public void setEmploymentstatus(String employmentstatus) {
        this.employmentstatus = employmentstatus;
    }

    public String getQuittype() {
        return quittype;
    }

    public void setQuittype(String quittype) {
        this.quittype = quittype;
    }

    public String getEmploymentstatusdt1() {
        return employmentstatusdt1;
    }

    public void setEmploymentstatusdt1(String employmentstatusdt1) {
        this.employmentstatusdt1 = employmentstatusdt1;
    }

    public Date getEmploymentstatusdt() {
        return employmentstatusdt;
    }

    public void setEmploymentstatusdt(Date employmentstatusdt) {
        this.employmentstatusdt = employmentstatusdt;
    }

    public String getStartworkdate1() {
        return startworkdate1;
    }

    public void setStartworkdate1(String startworkdate1) {
        this.startworkdate1 = startworkdate1;
    }

    public Date getStartworkdate() {
        return startworkdate;
    }

    public void setStartworkdate(Date startworkdate) {
        this.startworkdate = startworkdate;
    }

    public String getHomecountry() {
        return homecountry;
    }

    public void setHomecountry(String homecountry) {
        this.homecountry = homecountry;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomelaborlevelnm5() {
        return homelaborlevelnm5;
    }

    public void setHomelaborlevelnm5(String homelaborlevelnm5) {
        this.homelaborlevelnm5 = homelaborlevelnm5;
    }

    public String getHomelaborlevelnm3() {
        return homelaborlevelnm3;
    }

    public void setHomelaborlevelnm3(String homelaborlevelnm3) {
        this.homelaborlevelnm3 = homelaborlevelnm3;
    }

    public String getSpecialFlag() {
        return specialFlag;
    }

    public void setSpecialFlag(String specialFlag) {
        this.specialFlag = specialFlag;
    }

    public String getBuCode() {
        return buCode;
    }

    public void setBuCode(String buCode) {
        this.buCode = buCode;
    }

    public String getIfEicc() {
        return ifEicc;
    }

    public void setIfEicc(String ifEicc) {
        this.ifEicc = ifEicc;
    }

    public String getBuName() {
        return buName;
    }

    public void setBuName(String buName) {
        this.buName = buName;
    }

    public String getOutright() {
        return outright;
    }

    public void setOutright(String outright) {
        this.outright = outright;
    }

    public String getCardfFlag() {
        return cardfFlag;
    }

    public void setCardfFlag(String cardfFlag) {
        this.cardfFlag = cardfFlag;
    }
}
