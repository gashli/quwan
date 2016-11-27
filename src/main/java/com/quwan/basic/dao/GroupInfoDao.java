package com.quwan.basic.dao;

import com.quwan.basic.common.utils.MybatisBasicDao;
import com.quwan.basic.entity.GreetInfo;
import com.quwan.basic.entity.GroupInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupInfoDao  extends MybatisBasicDao<GreetInfo> {
}