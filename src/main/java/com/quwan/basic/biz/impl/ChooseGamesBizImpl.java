package com.quwan.basic.biz.impl;

import com.quwan.basic.biz.ChooseGamesBiz;
import com.quwan.basic.bo.BaseRequest;
import com.quwan.basic.bo.BaseResponse;
import com.quwan.basic.bo.UserInfoBo;
import com.quwan.basic.entity.UserInfo;
import com.quwan.basic.exception.QuWanException;
import com.quwan.basic.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
@Service
public class ChooseGamesBizImpl implements ChooseGamesBiz {

    @Autowired
    private UserInfoService userInfoService;
    @Override
    public BaseResponse<UserInfoBo> obtainChooseGames(BaseRequest request) {
        UserInfo userInfo = userInfoService.queryUserInfo(request.getUserId());
        UserInfoBo userInfoBo = userInfoService.converToBo(userInfo);
        return new BaseResponse(QuWanException.SUCCESS.getCode(),QuWanException.SUCCESS.getMessage(),userInfoBo) ;
    }
}
