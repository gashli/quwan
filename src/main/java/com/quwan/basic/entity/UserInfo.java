package com.quwan.basic.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserInfo {
    private Long id;

    /**
    * 用户id
    */
    private String userId;

    /**
    * 用户手机号
    */
    private String mobile;

    /**
    * 姓名
    */
    private String name;

    /**
    * 性别：0：女，1：男
    */
    private Short sex;

    /**
    * 出生日期
    */
    private String birthday;

    /**
    * 职业，对应
    */
    private String profession;

    /**
    * 收入
    */
    private BigDecimal income;

    /**
    * 学历
    */
    private String academic;

    /**
    * 毕业院校
    */
    private String finishSchool;

    /**
    * 当前所在地
    */
    private String address;

    /**
    * 是否有车，0：无，1：有
    */
    private Boolean carInfo;

    /**
    * 汽车型号
    */
    private String carModel;

    /**
    * 是否有房，0：无，1：有
    */
    private Boolean houseInfo;

    /**
    * 房子位置
    */
    private String houseLocation;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public String getAcademic() {
        return academic;
    }

    public void setAcademic(String academic) {
        this.academic = academic;
    }

    public String getFinishSchool() {
        return finishSchool;
    }

    public void setFinishSchool(String finishSchool) {
        this.finishSchool = finishSchool;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(Boolean carInfo) {
        this.carInfo = carInfo;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Boolean getHouseInfo() {
        return houseInfo;
    }

    public void setHouseInfo(Boolean houseInfo) {
        this.houseInfo = houseInfo;
    }

    public String getHouseLocation() {
        return houseLocation;
    }

    public void setHouseLocation(String houseLocation) {
        this.houseLocation = houseLocation;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}