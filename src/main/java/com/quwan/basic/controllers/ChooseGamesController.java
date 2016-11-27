package com.quwan.basic.controllers;

import com.quwan.basic.biz.ChooseGamesBiz;
import com.quwan.basic.bo.BaseRequest;
import com.quwan.basic.common.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
@Controller
@RequestMapping("userInfo/")
public class ChooseGamesController {

    @Autowired
    private ChooseGamesBiz chooseGamesBiz;

    @RequestMapping("obtainChooseGames.do")
    @ResponseBody
    public String obtainChooseGames(@ModelAttribute BaseRequest request){
        return JsonUtil.getGson().toJson(chooseGamesBiz.obtainChooseGames(request));

    }

}
