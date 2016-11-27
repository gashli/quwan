package com.quwan.basic.entity;

import java.util.Date;

public class UserCreditInfo {
    private Long id;

    /**
    * 用户id
    */
    private String userId;

    /**
    * 通道名称
    */
    private String channelName;

    /**
    * 通道结果
    */
    private String channelResult;

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

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelResult() {
        return channelResult;
    }

    public void setChannelResult(String channelResult) {
        this.channelResult = channelResult;
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