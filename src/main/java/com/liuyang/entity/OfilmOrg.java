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
@Table(name = "cux_ofilm_org")
public class OfilmOrg implements Serializable {
    @Id
    @Column(name = "dept_code")
    private String deptCode;
    @Column(name = "dept_name")
    private String deptName;
    @Column(name = "parent_dept_code")
    private String parentDeptCode;
    @Column(name = "dept_path_text")
    private String deptPathText;
    @Column(name = "effective_date")
    private Date effectiveDate;
    @Column(name = "effective_status")
    private String effectiveStatus;
    @Column(name = "process_flag")
    private String processFlag;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name = "last_update_date")
    private Date lastUpdateDate;

    public OfilmOrg() {
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getParentDeptCode() {
        return parentDeptCode;
    }

    public void setParentDeptCode(String parentDeptCode) {
        this.parentDeptCode = parentDeptCode;
    }

    public String getDeptPathText() {
        return deptPathText;
    }

    public void setDeptPathText(String deptPathText) {
        this.deptPathText = deptPathText;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getEffectiveStatus() {
        return effectiveStatus;
    }

    public void setEffectiveStatus(String effectiveStatus) {
        this.effectiveStatus = effectiveStatus;
    }

    public String getProcessFlag() {
        return processFlag;
    }

    public void setProcessFlag(String processFlag) {
        this.processFlag = processFlag;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OfilmOrg ofilmOrg = (OfilmOrg) o;

        if (deptCode != null ? !deptCode.equals(ofilmOrg.deptCode) : ofilmOrg.deptCode != null) return false;
        if (deptName != null ? !deptName.equals(ofilmOrg.deptName) : ofilmOrg.deptName != null) return false;
        if (parentDeptCode != null ? !parentDeptCode.equals(ofilmOrg.parentDeptCode) : ofilmOrg.parentDeptCode != null)
            return false;
        if (deptPathText != null ? !deptPathText.equals(ofilmOrg.deptPathText) : ofilmOrg.deptPathText != null)
            return false;
        if (effectiveDate != null ? !effectiveDate.equals(ofilmOrg.effectiveDate) : ofilmOrg.effectiveDate != null)
            return false;
        if (effectiveStatus != null ? !effectiveStatus.equals(ofilmOrg.effectiveStatus) : ofilmOrg.effectiveStatus != null)
            return false;
        if (processFlag != null ? !processFlag.equals(ofilmOrg.processFlag) : ofilmOrg.processFlag != null)
            return false;
        if (creationDate != null ? !creationDate.equals(ofilmOrg.creationDate) : ofilmOrg.creationDate != null)
            return false;
        return lastUpdateDate != null ? lastUpdateDate.equals(ofilmOrg.lastUpdateDate) : ofilmOrg.lastUpdateDate == null;
    }

    @Override
    public int hashCode() {
        int result = deptCode != null ? deptCode.hashCode() : 0;
        result = 31 * result + (deptName != null ? deptName.hashCode() : 0);
        result = 31 * result + (parentDeptCode != null ? parentDeptCode.hashCode() : 0);
        result = 31 * result + (deptPathText != null ? deptPathText.hashCode() : 0);
        result = 31 * result + (effectiveDate != null ? effectiveDate.hashCode() : 0);
        result = 31 * result + (effectiveStatus != null ? effectiveStatus.hashCode() : 0);
        result = 31 * result + (processFlag != null ? processFlag.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OfilmOrg{" +
                "deptCode='" + deptCode + '\'' +
                ", deptName='" + deptName + '\'' +
                ", parentDeptCode='" + parentDeptCode + '\'' +
                ", deptPathText='" + deptPathText + '\'' +
                ", effectiveDate=" + effectiveDate +
                ", effectiveStatus='" + effectiveStatus + '\'' +
                ", processFlag='" + processFlag + '\'' +
                ", creationDate=" + creationDate +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}
