package com.liuyang.entitySec;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by liuyang on 2018/6/24
 */
@Entity
@Table(name = "DEPTINFO_KRONOS_V")
public class DepartmentSec {

    @Column
    private String deptcode;
    @Column
    private String deptname;
    @Column
    private String fDeptcode;
    @Column
    private String effective;
    @Id
    @Column(name = "pk_deptdoc")
    private String pkDeptdoc;

    public DepartmentSec() {
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getfDeptcode() {
        return fDeptcode;
    }

    public void setfDeptcode(String fDeptcode) {
        this.fDeptcode = fDeptcode;
    }

    public String getEffective() {
        return effective;
    }

    public void setEffective(String effective) {
        this.effective = effective;
    }

    public String getPkDeptdoc() {
        return pkDeptdoc;
    }

    public void setPkDeptdoc(String pkDeptdoc) {
        this.pkDeptdoc = pkDeptdoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentSec that = (DepartmentSec) o;

        if (deptcode != null ? !deptcode.equals(that.deptcode) : that.deptcode != null) return false;
        if (deptname != null ? !deptname.equals(that.deptname) : that.deptname != null) return false;
        if (fDeptcode != null ? !fDeptcode.equals(that.fDeptcode) : that.fDeptcode != null) return false;
        if (effective != null ? !effective.equals(that.effective) : that.effective != null) return false;
        return pkDeptdoc != null ? pkDeptdoc.equals(that.pkDeptdoc) : that.pkDeptdoc == null;
    }

    @Override
    public int hashCode() {
        int result = deptcode != null ? deptcode.hashCode() : 0;
        result = 31 * result + (deptname != null ? deptname.hashCode() : 0);
        result = 31 * result + (fDeptcode != null ? fDeptcode.hashCode() : 0);
        result = 31 * result + (effective != null ? effective.hashCode() : 0);
        result = 31 * result + (pkDeptdoc != null ? pkDeptdoc.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DepartmentSec{" +
                "deptcode='" + deptcode + '\'' +
                ", deptname='" + deptname + '\'' +
                ", fDeptcode='" + fDeptcode + '\'' +
                ", effective='" + effective + '\'' +
                ", pkDeptdoc='" + pkDeptdoc + '\'' +
                '}';
    }
}
