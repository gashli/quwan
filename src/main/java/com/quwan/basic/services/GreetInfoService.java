package com.quwan.basic.services;

import com.quwan.basic.entity.GreetInfo;

import java.util.List;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public interface GreetInfoService {

    GreetInfo  queryGreetInfoBySex(String sex);

    List<GreetInfo>  queryGreetInfos(String sex);
}
