package com.quwan.basic.bo;

import java.io.Serializable;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public class BaseRequest implements Serializable {

    /**
     * 设备号
     */
    private String deviceNum;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 经度
     */
    private String longitude;
    /**
     * 纬度
     */
    private String estimate;
    /**
     * 手机号
     */
    private String mobile;

    public String getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseRequest{");
        sb.append("deviceNum='").append(deviceNum).append('\'');
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", longitude='").append(longitude).append('\'');
        sb.append(", estimate='").append(estimate).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
