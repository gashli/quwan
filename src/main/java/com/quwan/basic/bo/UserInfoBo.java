package com.quwan.basic.bo;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public class UserInfoBo {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 出生日期
     */
    private String birthday;
    /**
     * 职业
     */
    private String profession;
    /**
     * 收入
     */
    private String income;
    /**
     * 学历
     */
    private String academic;
    /**
     * 毕业院校
     */
    private String finishSchool;
    /**
     * 当前所在地（住处）
     */
    private String address;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserInfoBo{");
        sb.append("userId='").append(userId).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", birthday='").append(birthday).append('\'');
        sb.append(", profession='").append(profession).append('\'');
        sb.append(", income='").append(income).append('\'');
        sb.append(", academic='").append(academic).append('\'');
        sb.append(", finishSchool='").append(finishSchool).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
