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
@Table(name = "cux_contrast_department")
public class Department implements Serializable {
    @Column(name = "dept_name")
    private String deptName;
    @Column(name = "syscode_old")
    private String syscodeOld;
    @Id
    @Column(name = "syskey_old")
    private String syskeyOld;
    @Column(name = "syscode_new")
    private String syscodeNew;
    @Column(name = "syskey_new")
    private String syskeyNew;

    public Department() {
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getSyscodeOld() {
        return syscodeOld;
    }

    public void setSyscodeOld(String syscodeOld) {
        this.syscodeOld = syscodeOld;
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

        Department that = (Department) o;

        if (deptName != null ? !deptName.equals(that.deptName) : that.deptName != null) return false;
        if (syscodeOld != null ? !syscodeOld.equals(that.syscodeOld) : that.syscodeOld != null) return false;
        if (syskeyOld != null ? !syskeyOld.equals(that.syskeyOld) : that.syskeyOld != null) return false;
        if (syscodeNew != null ? !syscodeNew.equals(that.syscodeNew) : that.syscodeNew != null) return false;
        return syskeyNew != null ? syskeyNew.equals(that.syskeyNew) : that.syskeyNew == null;
    }

    @Override
    public int hashCode() {
        int result = deptName != null ? deptName.hashCode() : 0;
        result = 31 * result + (syscodeOld != null ? syscodeOld.hashCode() : 0);
        result = 31 * result + (syskeyOld != null ? syskeyOld.hashCode() : 0);
        result = 31 * result + (syscodeNew != null ? syscodeNew.hashCode() : 0);
        result = 31 * result + (syskeyNew != null ? syskeyNew.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", syscodeOld='" + syscodeOld + '\'' +
                ", syskeyOld='" + syskeyOld + '\'' +
                ", syscodeNew='" + syscodeNew + '\'' +
                ", syskeyNew='" + syskeyNew + '\'' +
                '}';
    }
}
