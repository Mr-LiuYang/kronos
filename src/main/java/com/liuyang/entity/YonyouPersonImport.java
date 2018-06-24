package com.liuyang.entity;

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
@Table(name = "yonyou_person_import")
public class YonyouPersonImport  implements Serializable {
    @Id
    @Column
    private String personnum;
    @Column
    private String personfullname;
    @Column
    private String homelaborlevelnm2;
    @Column
    private String homelaborleveldsc2;
    @Column
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
    @Column
    private Integer badgenum;
    @Column
    private Date badgenumeffectivedate;
    @Column
    private Date birthday;
    @Column
    private String sex;
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
    @Column
    private Date employmentstatusdt;
    @Column
    private Date startworkdate;
    @Column
    private String homecountry;
    @Column
    private String homelaborlevelnm1;
    @Column(name = "process_flag")
    private String processFlag;
    @Column
    private String attribute1;
    @Column
    private String attribute2;
    @Column
    private String attribute3;
    @Column
    private String attribute4;
    @Column
    private String attribute5;
    @Column
    private String attribute6;
    @Column
    private String attribute7;
    @Column
    private String attribute8;
    @Column
    private String attribute9;
    @Column
    private String attribute10;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name = "last_update_date")
    private Date lastUpdateDate;
    @Column
    private String homelaborlevelnm5;
    @Column
    private String workemailaddress;
    @Column
    private String homelaborlevelnm3;
    @Column(name = "special_flag")
    private String specialFlag;
    @Column(name = "bu_code")
    private String buCode;
    @Column(name = "if_eicc")
    private String ifEicc;

    public YonyouPersonImport() {
    }

    @Override
    public String toString() {
        return "YonyouPersonImport{" +
                "personnum='" + personnum + '\'' +
                ", personfullname='" + personfullname + '\'' +
                ", homelaborlevelnm2='" + homelaborlevelnm2 + '\'' +
                ", homelaborleveldsc2='" + homelaborleveldsc2 + '\'' +
                ", hiredate=" + hiredate +
                ", workprocedd='" + workprocedd + '\'' +
                ", workstation='" + workstation + '\'' +
                ", homelaborleveldsc3='" + homelaborleveldsc3 + '\'' +
                ", firstorderpost='" + firstorderpost + '\'' +
                ", secondorderpost='" + secondorderpost + '\'' +
                ", homelaborleveldsc5='" + homelaborleveldsc5 + '\'' +
                ", position='" + position + '\'' +
                ", ranks='" + ranks + '\'' +
                ", badgenum=" + badgenum +
                ", badgenumeffectivedate=" + badgenumeffectivedate +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", homelaborleveldsc1='" + homelaborleveldsc1 + '\'' +
                ", maritalstatus='" + maritalstatus + '\'' +
                ", personnelclassfication='" + personnelclassfication + '\'' +
                ", employmentstatus='" + employmentstatus + '\'' +
                ", quittype='" + quittype + '\'' +
                ", employmentstatusdt=" + employmentstatusdt +
                ", startworkdate=" + startworkdate +
                ", homecountry='" + homecountry + '\'' +
                ", homelaborlevelnm1='" + homelaborlevelnm1 + '\'' +
                ", processFlag='" + processFlag + '\'' +
                ", attribute1='" + attribute1 + '\'' +
                ", attribute2='" + attribute2 + '\'' +
                ", attribute3='" + attribute3 + '\'' +
                ", attribute4='" + attribute4 + '\'' +
                ", attribute5='" + attribute5 + '\'' +
                ", attribute6='" + attribute6 + '\'' +
                ", attribute7='" + attribute7 + '\'' +
                ", attribute8='" + attribute8 + '\'' +
                ", attribute9='" + attribute9 + '\'' +
                ", attribute10='" + attribute10 + '\'' +
                ", creationDate=" + creationDate +
                ", lastUpdateDate=" + lastUpdateDate +
                ", homelaborlevelnm5='" + homelaborlevelnm5 + '\'' +
                ", workemailaddress='" + workemailaddress + '\'' +
                ", homelaborlevelnm3='" + homelaborlevelnm3 + '\'' +
                ", specialFlag='" + specialFlag + '\'' +
                ", buCode='" + buCode + '\'' +
                ", ifEicc='" + ifEicc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YonyouPersonImport that = (YonyouPersonImport) o;

        if (badgenum != that.badgenum) return false;
        if (personnum != null ? !personnum.equals(that.personnum) : that.personnum != null) return false;
        if (personfullname != null ? !personfullname.equals(that.personfullname) : that.personfullname != null)
            return false;
        if (homelaborlevelnm2 != null ? !homelaborlevelnm2.equals(that.homelaborlevelnm2) : that.homelaborlevelnm2 != null)
            return false;
        if (homelaborleveldsc2 != null ? !homelaborleveldsc2.equals(that.homelaborleveldsc2) : that.homelaborleveldsc2 != null)
            return false;
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
        if (badgenumeffectivedate != null ? !badgenumeffectivedate.equals(that.badgenumeffectivedate) : that.badgenumeffectivedate != null)
            return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (homelaborleveldsc1 != null ? !homelaborleveldsc1.equals(that.homelaborleveldsc1) : that.homelaborleveldsc1 != null)
            return false;
        if (maritalstatus != null ? !maritalstatus.equals(that.maritalstatus) : that.maritalstatus != null)
            return false;
        if (personnelclassfication != null ? !personnelclassfication.equals(that.personnelclassfication) : that.personnelclassfication != null)
            return false;
        if (employmentstatus != null ? !employmentstatus.equals(that.employmentstatus) : that.employmentstatus != null)
            return false;
        if (quittype != null ? !quittype.equals(that.quittype) : that.quittype != null) return false;
        if (employmentstatusdt != null ? !employmentstatusdt.equals(that.employmentstatusdt) : that.employmentstatusdt != null)
            return false;
        if (startworkdate != null ? !startworkdate.equals(that.startworkdate) : that.startworkdate != null)
            return false;
        if (homecountry != null ? !homecountry.equals(that.homecountry) : that.homecountry != null) return false;
        if (homelaborlevelnm1 != null ? !homelaborlevelnm1.equals(that.homelaborlevelnm1) : that.homelaborlevelnm1 != null)
            return false;
        if (processFlag != null ? !processFlag.equals(that.processFlag) : that.processFlag != null) return false;
        if (attribute1 != null ? !attribute1.equals(that.attribute1) : that.attribute1 != null) return false;
        if (attribute2 != null ? !attribute2.equals(that.attribute2) : that.attribute2 != null) return false;
        if (attribute3 != null ? !attribute3.equals(that.attribute3) : that.attribute3 != null) return false;
        if (attribute4 != null ? !attribute4.equals(that.attribute4) : that.attribute4 != null) return false;
        if (attribute5 != null ? !attribute5.equals(that.attribute5) : that.attribute5 != null) return false;
        if (attribute6 != null ? !attribute6.equals(that.attribute6) : that.attribute6 != null) return false;
        if (attribute7 != null ? !attribute7.equals(that.attribute7) : that.attribute7 != null) return false;
        if (attribute8 != null ? !attribute8.equals(that.attribute8) : that.attribute8 != null) return false;
        if (attribute9 != null ? !attribute9.equals(that.attribute9) : that.attribute9 != null) return false;
        if (attribute10 != null ? !attribute10.equals(that.attribute10) : that.attribute10 != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (homelaborlevelnm5 != null ? !homelaborlevelnm5.equals(that.homelaborlevelnm5) : that.homelaborlevelnm5 != null)
            return false;
        if (workemailaddress != null ? !workemailaddress.equals(that.workemailaddress) : that.workemailaddress != null)
            return false;
        if (homelaborlevelnm3 != null ? !homelaborlevelnm3.equals(that.homelaborlevelnm3) : that.homelaborlevelnm3 != null)
            return false;
        if (specialFlag != null ? !specialFlag.equals(that.specialFlag) : that.specialFlag != null) return false;
        if (buCode != null ? !buCode.equals(that.buCode) : that.buCode != null) return false;
        return ifEicc != null ? ifEicc.equals(that.ifEicc) : that.ifEicc == null;
    }

    @Override
    public int hashCode() {
        int result = personnum != null ? personnum.hashCode() : 0;
        result = 31 * result + (personfullname != null ? personfullname.hashCode() : 0);
        result = 31 * result + (homelaborlevelnm2 != null ? homelaborlevelnm2.hashCode() : 0);
        result = 31 * result + (homelaborleveldsc2 != null ? homelaborleveldsc2.hashCode() : 0);
        result = 31 * result + (hiredate != null ? hiredate.hashCode() : 0);
        result = 31 * result + (workprocedd != null ? workprocedd.hashCode() : 0);
        result = 31 * result + (workstation != null ? workstation.hashCode() : 0);
        result = 31 * result + (homelaborleveldsc3 != null ? homelaborleveldsc3.hashCode() : 0);
        result = 31 * result + (firstorderpost != null ? firstorderpost.hashCode() : 0);
        result = 31 * result + (secondorderpost != null ? secondorderpost.hashCode() : 0);
        result = 31 * result + (homelaborleveldsc5 != null ? homelaborleveldsc5.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (ranks != null ? ranks.hashCode() : 0);
        result = 31 * result + badgenum;
        result = 31 * result + (badgenumeffectivedate != null ? badgenumeffectivedate.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (homelaborleveldsc1 != null ? homelaborleveldsc1.hashCode() : 0);
        result = 31 * result + (maritalstatus != null ? maritalstatus.hashCode() : 0);
        result = 31 * result + (personnelclassfication != null ? personnelclassfication.hashCode() : 0);
        result = 31 * result + (employmentstatus != null ? employmentstatus.hashCode() : 0);
        result = 31 * result + (quittype != null ? quittype.hashCode() : 0);
        result = 31 * result + (employmentstatusdt != null ? employmentstatusdt.hashCode() : 0);
        result = 31 * result + (startworkdate != null ? startworkdate.hashCode() : 0);
        result = 31 * result + (homecountry != null ? homecountry.hashCode() : 0);
        result = 31 * result + (homelaborlevelnm1 != null ? homelaborlevelnm1.hashCode() : 0);
        result = 31 * result + (processFlag != null ? processFlag.hashCode() : 0);
        result = 31 * result + (attribute1 != null ? attribute1.hashCode() : 0);
        result = 31 * result + (attribute2 != null ? attribute2.hashCode() : 0);
        result = 31 * result + (attribute3 != null ? attribute3.hashCode() : 0);
        result = 31 * result + (attribute4 != null ? attribute4.hashCode() : 0);
        result = 31 * result + (attribute5 != null ? attribute5.hashCode() : 0);
        result = 31 * result + (attribute6 != null ? attribute6.hashCode() : 0);
        result = 31 * result + (attribute7 != null ? attribute7.hashCode() : 0);
        result = 31 * result + (attribute8 != null ? attribute8.hashCode() : 0);
        result = 31 * result + (attribute9 != null ? attribute9.hashCode() : 0);
        result = 31 * result + (attribute10 != null ? attribute10.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (homelaborlevelnm5 != null ? homelaborlevelnm5.hashCode() : 0);
        result = 31 * result + (workemailaddress != null ? workemailaddress.hashCode() : 0);
        result = 31 * result + (homelaborlevelnm3 != null ? homelaborlevelnm3.hashCode() : 0);
        result = 31 * result + (specialFlag != null ? specialFlag.hashCode() : 0);
        result = 31 * result + (buCode != null ? buCode.hashCode() : 0);
        result = 31 * result + (ifEicc != null ? ifEicc.hashCode() : 0);
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

    public int getBadgenum() {
        return badgenum;
    }

    public void setBadgenum(int badgenum) {
        this.badgenum = badgenum;
    }

    public Date getBadgenumeffectivedate() {
        return badgenumeffectivedate;
    }

    public void setBadgenumeffectivedate(Date badgenumeffectivedate) {
        this.badgenumeffectivedate = badgenumeffectivedate;
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

    public Date getEmploymentstatusdt() {
        return employmentstatusdt;
    }

    public void setEmploymentstatusdt(Date employmentstatusdt) {
        this.employmentstatusdt = employmentstatusdt;
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

    public String getHomelaborlevelnm1() {
        return homelaborlevelnm1;
    }

    public void setHomelaborlevelnm1(String homelaborlevelnm1) {
        this.homelaborlevelnm1 = homelaborlevelnm1;
    }

    public String getProcessFlag() {
        return processFlag;
    }

    public void setProcessFlag(String processFlag) {
        this.processFlag = processFlag;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getHomelaborlevelnm5() {
        return homelaborlevelnm5;
    }

    public void setHomelaborlevelnm5(String homelaborlevelnm5) {
        this.homelaborlevelnm5 = homelaborlevelnm5;
    }

    public String getWorkemailaddress() {
        return workemailaddress;
    }

    public void setWorkemailaddress(String workemailaddress) {
        this.workemailaddress = workemailaddress;
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
}
