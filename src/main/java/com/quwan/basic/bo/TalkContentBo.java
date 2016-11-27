package com.quwan.basic.bo;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public class TalkContentBo {
    /**
     *
     */
    private String groupId;
    /**
     * 用户姓名
     */
    private String userId;
    /**
     * 聊天内容
     */
    private String content;
    /**
     * 创建时间
     */
    private String createTime;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TalkContentBo{");
        sb.append("groupId='").append(groupId).append('\'');
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append(", createTime='").append(createTime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
