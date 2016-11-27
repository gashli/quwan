package com.quwan.basic.entity;

import java.util.Date;

public class GroupUserIds {
    private Long id;

    /**
    * 群id
    */
    private String groupId;

    /**
    * 用户id
    */
    private String userId;

    /**
    * 用户别名
    */
    private String userAliasName;

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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAliasName() {
        return userAliasName;
    }

    public void setUserAliasName(String userAliasName) {
        this.userAliasName = userAliasName;
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