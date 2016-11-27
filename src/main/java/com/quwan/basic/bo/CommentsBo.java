package com.quwan.basic.bo;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public class CommentsBo {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 评论id
     */
    private String commentId;
    /**
     * 评论内容
     */
    private String commentContent;
    /**
     * 父评论id
     */
    private String parentId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommentsBo{");
        sb.append("userId='").append(userId).append('\'');
        sb.append(", commentId='").append(commentId).append('\'');
        sb.append(", commentContent='").append(commentContent).append('\'');
        sb.append(", parentId='").append(parentId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
