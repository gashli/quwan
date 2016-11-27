package com.quwan.basic.bo;

import java.util.List;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public class GroupInfoBo {
    /**
     *
     */
    private String groupName;
    /**
     * 用户姓名
     */
    private String createUserId;
    /**
     * 图片url
     */
    private List<String> pictureUrls;
    /**
     * 通知的id列表
     */
    private List<String> noticeIds;
    /**
     * 简介
     */
    private String intcoduction;
    /**
     * 推荐内容url
     */
    private String recommentUrl;
    /**
     * 当前群用户信息
     */
    private List<GroupUserInfoBo> userInfos;
    /**
     * 当前群消息
     */
    private List<TalkContentBo> chatContentInfos;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public List<String> getPictureUrls() {
        return pictureUrls;
    }

    public void setPictureUrls(List<String> pictureUrls) {
        this.pictureUrls = pictureUrls;
    }

    public List<String> getNoticeIds() {
        return noticeIds;
    }

    public void setNoticeIds(List<String> noticeIds) {
        this.noticeIds = noticeIds;
    }

    public String getIntcoduction() {
        return intcoduction;
    }

    public void setIntcoduction(String intcoduction) {
        this.intcoduction = intcoduction;
    }

    public String getRecommentUrl() {
        return recommentUrl;
    }

    public void setRecommentUrl(String recommentUrl) {
        this.recommentUrl = recommentUrl;
    }

    public List<GroupUserInfoBo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(List<GroupUserInfoBo> userInfos) {
        this.userInfos = userInfos;
    }

    public List<TalkContentBo> getChatContentInfos() {
        return chatContentInfos;
    }

    public void setChatContentInfos(List<TalkContentBo> chatContentInfos) {
        this.chatContentInfos = chatContentInfos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupInfoBo{");
        sb.append("groupName='").append(groupName).append('\'');
        sb.append(", createUserId='").append(createUserId).append('\'');
        sb.append(", pictureUrls=").append(pictureUrls);
        sb.append(", noticeIds=").append(noticeIds);
        sb.append(", intcoduction='").append(intcoduction).append('\'');
        sb.append(", recommentUrl='").append(recommentUrl).append('\'');
        sb.append(", userInfos=").append(userInfos);
        sb.append(", chatContentInfos=").append(chatContentInfos);
        sb.append('}');
        return sb.toString();
    }
}
