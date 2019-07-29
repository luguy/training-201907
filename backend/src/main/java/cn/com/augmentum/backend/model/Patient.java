package cn.com.augmentum.backend.model;

import java.util.Date;

public class Patient {
    private String id;

    private String name;

    private Integer gender;

    private String sickAge;

    private Date birthday;

    private Integer bmi;

    private Date updateTime;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getSickAge() {
        return sickAge;
    }

    public void setSickAge(String sickAge) {
        this.sickAge = sickAge == null ? null : sickAge.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getBmi() {
        return bmi;
    }

    public void setBmi(Integer bmi) {
        this.bmi = bmi;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}