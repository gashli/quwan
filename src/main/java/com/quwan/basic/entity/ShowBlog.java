package com.quwan.basic.entity;

import java.util.Date;

public class ShowBlog {
    private Long id;

    /**
    * 用户id
    */
    private String userId;

    /**
    * blog内容
    */
    private String message;

    /**
    * 图片地址
    */
    private String pictureUrls;

    /**
    * 去玩活动id
    */
    private Long quwanId;

    /**
    * 被赞次数
    */
    private Integer supportTimes;

    /**
    * 被踩次数
    */
    private Integer demeanTimes;

    /**
    * 动态发布时的地址
    */
    private String address;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPictureUrls() {
        return pictureUrls;
    }

    public void setPictureUrls(String pictureUrls) {
        this.pictureUrls = pictureUrls;
    }

    public Long getQuwanId() {
        return quwanId;
    }

    public void setQuwanId(Long quwanId) {
        this.quwanId = quwanId;
    }

    public Integer getSupportTimes() {
        return supportTimes;
    }

    public void setSupportTimes(Integer supportTimes) {
        this.supportTimes = supportTimes;
    }

    public Integer getDemeanTimes() {
        return demeanTimes;
    }

    public void setDemeanTimes(Integer demeanTimes) {
        this.demeanTimes = demeanTimes;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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