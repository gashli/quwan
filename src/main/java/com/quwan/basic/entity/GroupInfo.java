package com.quwan.basic.entity;

import java.util.Date;

public class GroupInfo {
    private Long id;

    /**
    * 群名称
    */
    private String name;

    /**
    * 群类型，0:单人对话,1:多人对话
    */
    private Byte groupType;

    /**
    * 创建者id
    */
    private String createUserId;

    /**
    * 图片url
    */
    private String pictureUrls;

    /**
    * 公告id列表
    */
    private String noticeIds;

    /**
    * 群简介
    */
    private String introduction;

    /**
    * 推荐内容url
    */
    private String recommendUrl;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getGroupType() {
        return groupType;
    }

    public void setGroupType(Byte groupType) {
        this.groupType = groupType;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getPictureUrls() {
        return pictureUrls;
    }

    public void setPictureUrls(String pictureUrls) {
        this.pictureUrls = pictureUrls;
    }

    public String getNoticeIds() {
        return noticeIds;
    }

    public void setNoticeIds(String noticeIds) {
        this.noticeIds = noticeIds;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getRecommendUrl() {
        return recommendUrl;
    }

    public void setRecommendUrl(String recommendUrl) {
        this.recommendUrl = recommendUrl;
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