package com.quwan.basic.bo;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public class GroupUserInfoBo {
    /**
     * 群id
     */
    private String groupId;
    /**
     * 用户姓名
     */
    private String userId;
    /**
     * 用户别名
     */
    private String userAliasName;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupUserInfoBo{");
        sb.append("groupId='").append(groupId).append('\'');
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", userAliasName='").append(userAliasName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
