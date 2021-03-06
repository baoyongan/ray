package com.arc.excel.mapper;


import com.arc.excel.model.entries.mall.MallTask;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是持久层，目的是与数据库交互，
 */
public interface MallTaskMapper {

    int save(MallTask task);

    int delete(Long id);

    int update(MallTask task);

    MallTask get(Long id);

    List<MallTask> list();

}
