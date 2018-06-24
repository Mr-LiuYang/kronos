package com.liuyang.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by liuyang on 2018/6/24
 */
@Entity
@Table(name = "cux_contrast_company")
public class Company implements Serializable {

    @Column(name = "company_name")
    private String companyName;
    @Column(name = "syscode_old")
    private String syscodeld;
    @Id
    @Column(name = "syskey_old")
    private String syskeyOld;
    @Column(name = "syscode_new")
    private String syscodeNew;
    @Column(name = "syskey_new")
    private String syskeyNew;

    public Company() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSyscodeld() {
        return syscodeld;
    }

    public void setSyscodeld(String syscodeld) {
        this.syscodeld = syscodeld;
    }

    public String getSyskeyOld() {
        return syskeyOld;
    }

    public void setSyskeyOld(String syskeyOld) {
        this.syskeyOld = syskeyOld;
    }

    public String getSyscodeNew() {
        return syscodeNew;
    }

    public void setSyscodeNew(String syscodeNew) {
        this.syscodeNew = syscodeNew;
    }

    public String getSyskeyNew() {
        return syskeyNew;
    }

    public void setSyskeyNew(String syskeyNew) {
        this.syskeyNew = syskeyNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (companyName != null ? !companyName.equals(company.companyName) : company.companyName != null) return false;
        if (syscodeld != null ? !syscodeld.equals(company.syscodeld) : company.syscodeld != null) return false;
        if (syskeyOld != null ? !syskeyOld.equals(company.syskeyOld) : company.syskeyOld != null) return false;
        if (syscodeNew != null ? !syscodeNew.equals(company.syscodeNew) : company.syscodeNew != null) return false;
        return syskeyNew != null ? syskeyNew.equals(company.syskeyNew) : company.syskeyNew == null;
    }

    @Override
    public int hashCode() {
        int result = companyName != null ? companyName.hashCode() : 0;
        result = 31 * result + (syscodeld != null ? syscodeld.hashCode() : 0);
        result = 31 * result + (syskeyOld != null ? syskeyOld.hashCode() : 0);
        result = 31 * result + (syscodeNew != null ? syscodeNew.hashCode() : 0);
        result = 31 * result + (syskeyNew != null ? syskeyNew.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", syscodeld='" + syscodeld + '\'' +
                ", syskeyOld='" + syskeyOld + '\'' +
                ", syscodeNew='" + syscodeNew + '\'' +
                ", syskeyNew='" + syskeyNew + '\'' +
                '}';
    }
}
