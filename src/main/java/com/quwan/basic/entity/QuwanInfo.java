package com.quwan.basic.entity;

import java.math.BigDecimal;
import java.util.Date;

public class QuwanInfo {
    private Long id;

    /**
    * 活动标题
    */
    private String title;

    /**
    * 去玩时间
    */
    private Date quwanTime;

    /**
    * 活动目的地
    */
    private String destination;

    /**
    * 消费类型，0:AA,1:男生买单,2:女生买单,3:群主买单,4:到时再看
    */
    private Byte costType;

    /**
    * 预计花费
    */
    private BigDecimal exceptCost;

    /**
    * 实际花费
    */
    private BigDecimal realCost;

    /**
    * 期望人数
    */
    private Short expectPersons;

    /**
    * 去玩状态,0:初始,1:进行中,2:已结束
    */
    private Byte quwanStatus;

    /**
    * 去玩活动结束时间
    */
    private Date finishTime;

    /**
    * 去玩事件id
    */
    private Long quwanEventId;

    /**
    * 去玩群id
    */
    private Long quwanGroupId;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getQuwanTime() {
        return quwanTime;
    }

    public void setQuwanTime(Date quwanTime) {
        this.quwanTime = quwanTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Byte getCostType() {
        return costType;
    }

    public void setCostType(Byte costType) {
        this.costType = costType;
    }

    public BigDecimal getExceptCost() {
        return exceptCost;
    }

    public void setExceptCost(BigDecimal exceptCost) {
        this.exceptCost = exceptCost;
    }

    public BigDecimal getRealCost() {
        return realCost;
    }

    public void setRealCost(BigDecimal realCost) {
        this.realCost = realCost;
    }

    public Short getExpectPersons() {
        return expectPersons;
    }

    public void setExpectPersons(Short expectPersons) {
        this.expectPersons = expectPersons;
    }

    public Byte getQuwanStatus() {
        return quwanStatus;
    }

    public void setQuwanStatus(Byte quwanStatus) {
        this.quwanStatus = quwanStatus;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Long getQuwanEventId() {
        return quwanEventId;
    }

    public void setQuwanEventId(Long quwanEventId) {
        this.quwanEventId = quwanEventId;
    }

    public Long getQuwanGroupId() {
        return quwanGroupId;
    }

    public void setQuwanGroupId(Long quwanGroupId) {
        this.quwanGroupId = quwanGroupId;
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