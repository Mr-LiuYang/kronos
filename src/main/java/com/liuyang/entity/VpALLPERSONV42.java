package com.liuyang.entity;

/**
 * Created by liuyang on 2018/6/24
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "vp_allpersonv42")
public class VpALLPERSONV42  implements Serializable {
    @Id
    @Column(name = "PERSONNUM")
    private String personnum;

    public VpALLPERSONV42() {
    }

    public String getPersonnum() {
        return personnum;
    }

    public void setPersonnum(String personnum) {
        this.personnum = personnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VpALLPERSONV42 that = (VpALLPERSONV42) o;

        return personnum != null ? personnum.equals(that.personnum) : that.personnum == null;
    }

    @Override
    public int hashCode() {
        return personnum != null ? personnum.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "VpALLPERSONV42{" +
                "personnum='" + personnum + '\'' +
                '}';
    }
}
