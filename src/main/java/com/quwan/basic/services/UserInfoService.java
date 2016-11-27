package com.quwan.basic.services;

import com.quwan.basic.bo.UserInfoBo;
import com.quwan.basic.entity.UserInfo;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public interface UserInfoService {

    UserInfo queryUserInfo(String userId);

    UserInfoBo converToBo(UserInfo userInfo);
}
