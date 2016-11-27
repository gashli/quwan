package com.quwan.basic.biz;

import com.quwan.basic.bo.BaseRequest;
import com.quwan.basic.bo.BaseResponse;
import com.quwan.basic.bo.UserInfoBo;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public interface ChooseGamesBiz {

    BaseResponse<UserInfoBo> obtainChooseGames(BaseRequest request);

}
