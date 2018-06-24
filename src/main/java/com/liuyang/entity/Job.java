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
@Table(name = "cux_contrast_job")
public class Job {
    @Column(name = "job_name")
    private String jobName;

    @Column(name = "syscode_old")
    private String syscodeOld;
    @Id
    @Column(name = "syskey_old")
    private String syskeyOld;
    @Column(name = "syscode_new")
    private String syscodeNew;
    @Column(name = "syskey_new")
    private String syskeyNew;

    public Job() {
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
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

        Job job = (Job) o;

        if (jobName != null ? !jobName.equals(job.jobName) : job.jobName != null) return false;
        if (syscodeOld != null ? !syscodeOld.equals(job.syscodeOld) : job.syscodeOld != null) return false;
        if (syskeyOld != null ? !syskeyOld.equals(job.syskeyOld) : job.syskeyOld != null) return false;
        if (syscodeNew != null ? !syscodeNew.equals(job.syscodeNew) : job.syscodeNew != null) return false;
        return syskeyNew != null ? syskeyNew.equals(job.syskeyNew) : job.syskeyNew == null;
    }

    @Override
    public int hashCode() {
        int result = jobName != null ? jobName.hashCode() : 0;
        result = 31 * result + (syscodeOld != null ? syscodeOld.hashCode() : 0);
        result = 31 * result + (syskeyOld != null ? syskeyOld.hashCode() : 0);
        result = 31 * result + (syscodeNew != null ? syscodeNew.hashCode() : 0);
        result = 31 * result + (syskeyNew != null ? syskeyNew.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobName='" + jobName + '\'' +
                ", syscodeOld='" + syscodeOld + '\'' +
                ", syskeyOld='" + syskeyOld + '\'' +
                ", syscodeNew='" + syscodeNew + '\'' +
                ", syskeyNew='" + syskeyNew + '\'' +
                '}';
    }
}
