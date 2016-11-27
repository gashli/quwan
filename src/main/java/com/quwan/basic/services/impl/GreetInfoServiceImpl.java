package com.quwan.basic.services.impl;

import com.quwan.basic.dao.DicKeyValueDao;
import com.quwan.basic.entity.GreetInfo;
import com.quwan.basic.services.GreetInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
@Service
public class GreetInfoServiceImpl implements GreetInfoService{
    @Resource
    private DicKeyValueDao dicKeyValueDao;


    @Override
    public GreetInfo queryGreetInfoBySex(String sex) {
        dicKeyValueDao.selectByPrimaryKey("");
        return null;
    }

    @Override
    public List<GreetInfo> queryGreetInfos(String sex) {
        return null;
    }
}
