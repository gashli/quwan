package com.quwan.basic.bo;

import java.util.List;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public class MoodsInfo {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 心情blog
     */
    private String message;
    /**
     * 用户照片url
     */
    private String pictureUrl;
    /**
     * 去玩活动id
     */
    private String quwanId;
    /**
     * 活动的标题
     */
    private String quwanTitle;
    /**
     * 职业
     */
    private String profession;
    /**
     * 学历
     */
    private String academic;
    /**
     * 毕业院校
     */
    private String finishSchool;
    /**
     * 评论
     */
    private List<CommentsBo> comments;
    /**
     * 点赞数
     */
    private Integer supportTimes;
    /**
     * 被踩次数
     */
    private Integer demeanTime;
    /**
     * 收到礼物数
     */
    private Integer giftNum;

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

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getQuwanId() {
        return quwanId;
    }

    public void setQuwanId(String quwanId) {
        this.quwanId = quwanId;
    }

    public String getQuwanTitle() {
        return quwanTitle;
    }

    public void setQuwanTitle(String quwanTitle) {
        this.quwanTitle = quwanTitle;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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

    public List<CommentsBo> getComments() {
        return comments;
    }

    public void setComments(List<CommentsBo> comments) {
        this.comments = comments;
    }

    public Integer getSupportTimes() {
        return supportTimes;
    }

    public void setSupportTimes(Integer supportTimes) {
        this.supportTimes = supportTimes;
    }

    public Integer getDemeanTime() {
        return demeanTime;
    }

    public void setDemeanTime(Integer demeanTime) {
        this.demeanTime = demeanTime;
    }

    public Integer getGiftNum() {
        return giftNum;
    }

    public void setGiftNum(Integer giftNum) {
        this.giftNum = giftNum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MoodsInfo{");
        sb.append("userId='").append(userId).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append(", pictureUrl='").append(pictureUrl).append('\'');
        sb.append(", quwanId='").append(quwanId).append('\'');
        sb.append(", quwanTitle='").append(quwanTitle).append('\'');
        sb.append(", profession='").append(profession).append('\'');
        sb.append(", academic='").append(academic).append('\'');
        sb.append(", finishSchool='").append(finishSchool).append('\'');
        sb.append(", comments=").append(comments);
        sb.append(", supportTimes=").append(supportTimes);
        sb.append(", demeanTime=").append(demeanTime);
        sb.append(", giftNum=").append(giftNum);
        sb.append('}');
        return sb.toString();
    }
}
