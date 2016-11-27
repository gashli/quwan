package com.quwan.basic.entity;

import java.util.Date;

public class UserCertifyInfo {
    private Long id;

    /**
    * 认证id
    */
    private String certifyId;

    /**
    * 用户id
    */
    private String userId;

    /**
    * 用户真实姓名
    */
    private String userName;

    /**
    * 身份证
    */
    private String identityCard;

    /**
    * 认证过的号
    */
    private String mobile;

    /**
    * 认证等级,1:手机号已认证,2:已身份认证,3:汽车已认证,4:住房已认证,5:征信渠道认证
    */
    private Byte certifyLevel;

    /**
    * 房屋认证信息
    */
    private String houseCertify;

    /**
    * 汽车认证信息
    */
    private String carCertify;

    /**
    * 征信信息id
    */
    private String creditId;

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

    public String getCertifyId() {
        return certifyId;
    }

    public void setCertifyId(String certifyId) {
        this.certifyId = certifyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Byte getCertifyLevel() {
        return certifyLevel;
    }

    public void setCertifyLevel(Byte certifyLevel) {
        this.certifyLevel = certifyLevel;
    }

    public String getHouseCertify() {
        return houseCertify;
    }

    public void setHouseCertify(String houseCertify) {
        this.houseCertify = houseCertify;
    }

    public String getCarCertify() {
        return carCertify;
    }

    public void setCarCertify(String carCertify) {
        this.carCertify = carCertify;
    }

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
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