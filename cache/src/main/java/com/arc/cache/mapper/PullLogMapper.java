package com.arc.cache.mapper;

import com.arc.cache.model.domain.PullLog;
import com.arc.cache.model.query.PullLogQuery;

import java.util.List;

/**
 * @author: yechao
 * @date: 2018/11/7 15:43
 * @description:
 */
public interface PullLogMapper {

    Long save(PullLog pullLog);

    PullLog get(Integer id);

    List<PullLog> list();

    int update(PullLog pullLog);

    int delete(Integer id);

    List<PullLog> listByPullLogQuery(PullLogQuery query);
}