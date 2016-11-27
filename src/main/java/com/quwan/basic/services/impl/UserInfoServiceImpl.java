package com.quwan.basic.services.impl;

import com.quwan.basic.bo.UserInfoBo;
import com.quwan.basic.entity.UserInfo;
import com.quwan.basic.services.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

//    @Resource
//    private UserInfoDao userInfoDao;

    @Override
    public UserInfo queryUserInfo(String userId) {
//        return userInfoDao.selectByUserIdOrDeviceNum(userId);
        return null;
    }

    @Override
    public UserInfoBo converToBo(UserInfo userInfo) {
        UserInfoBo userInfoBo = new UserInfoBo();
        userInfoBo.setUserId(userInfo.getUserId());
        userInfoBo.setAcademic(userInfo.getAcademic());
        userInfoBo.setAddress(userInfo.getAddress());
        userInfoBo.setBirthday(userInfo.getBirthday());
        userInfoBo.setFinishSchool(userInfo.getFinishSchool());
        userInfoBo.setIncome(String.valueOf(userInfo.getIncome()));
        userInfoBo.setMobile(userInfo.getMobile());
        userInfoBo.setName(userInfo.getName());
        userInfoBo.setProfession(userInfo.getProfession());
        userInfoBo.setSex(String.valueOf(userInfo.getSex()));
        return userInfoBo;
    }
}
