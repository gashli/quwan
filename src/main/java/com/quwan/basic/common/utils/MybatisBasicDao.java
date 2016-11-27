package com.quwan.basic.common.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author shiliang.gao
 * @since 2016-11-27
 */
public interface MybatisBasicDao<T> extends Mapper<T>, MySqlMapper<T> {
}
