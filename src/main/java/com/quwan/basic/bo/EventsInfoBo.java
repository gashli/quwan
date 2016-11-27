package com.quwan.basic.bo;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public class EventsInfoBo {

    /**
     * 事件id
     */
    private String eventId;
    /**
     * 活动标题
     */
    private String title;
    /**
     * 去玩活动时间
     */
    private String quwanTime;
    /**
     * 发blog的userId
     */
    private String userId;
    /**
     * blog的url
     */
    private String pictureUrls;
    /**
     * 去玩的状态
     */
    private String quwanStatus;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuwanTime() {
        return quwanTime;
    }

    public void setQuwanTime(String quwanTime) {
        this.quwanTime = quwanTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPictureUrls() {
        return pictureUrls;
    }

    public void setPictureUrls(String pictureUrls) {
        this.pictureUrls = pictureUrls;
    }

    public String getQuwanStatus() {
        return quwanStatus;
    }

    public void setQuwanStatus(String quwanStatus) {
        this.quwanStatus = quwanStatus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EventsInfoBo{");
        sb.append("eventId='").append(eventId).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", quwanTime='").append(quwanTime).append('\'');
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", pictureUrls='").append(pictureUrls).append('\'');
        sb.append(", quwanStatus='").append(quwanStatus).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
