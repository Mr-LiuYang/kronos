package com.liuyang.entity;

/**
 * Created by liuyang on 2018/6/24
 */


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cux_contrast_persontype")
public class Persontype implements Serializable {

    @Column(name = "persontype_name")
    private String persontypeName;
    @Column(name = "syscode_old")
    private String syscodeOld;
    @Id
    @Column(name = "syskey_old")
    private String syskeyOld;
    @Column(name = "syscode_new")
    private String syscodeNew;
    @Column(name = "syskey_new")
    private String syskeyNew;

    public Persontype() {
    }

    public String getPersontypeName() {
        return persontypeName;
    }

    public void setPersontypeName(String persontypeName) {
        this.persontypeName = persontypeName;
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

        Persontype that = (Persontype) o;

        if (persontypeName != null ? !persontypeName.equals(that.persontypeName) : that.persontypeName != null)
            return false;
        if (syscodeOld != null ? !syscodeOld.equals(that.syscodeOld) : that.syscodeOld != null) return false;
        if (syskeyOld != null ? !syskeyOld.equals(that.syskeyOld) : that.syskeyOld != null) return false;
        if (syscodeNew != null ? !syscodeNew.equals(that.syscodeNew) : that.syscodeNew != null) return false;
        return syskeyNew != null ? syskeyNew.equals(that.syskeyNew) : that.syskeyNew == null;
    }

    @Override
    public int hashCode() {
        int result = persontypeName != null ? persontypeName.hashCode() : 0;
        result = 31 * result + (syscodeOld != null ? syscodeOld.hashCode() : 0);
        result = 31 * result + (syskeyOld != null ? syskeyOld.hashCode() : 0);
        result = 31 * result + (syscodeNew != null ? syscodeNew.hashCode() : 0);
        result = 31 * result + (syskeyNew != null ? syskeyNew.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Persontype{" +
                "persontypeName='" + persontypeName + '\'' +
                ", syscodeOld='" + syscodeOld + '\'' +
                ", syskeyOld='" + syskeyOld + '\'' +
                ", syscodeNew='" + syscodeNew + '\'' +
                ", syskeyNew='" + syskeyNew + '\'' +
                '}';
    }
}
