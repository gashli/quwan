package com.quwan.basic.bo;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public class SaiHaiRequest extends BaseRequest {
    private String targetUserId;

    public String getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SaiHaiRequest{");
        sb.append("targetUserId='").append(targetUserId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
