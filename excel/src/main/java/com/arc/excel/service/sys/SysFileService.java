package com.arc.excel.service.sys;

import com.arc.excel.model.entries.sys.SysFile;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是服务层，目的是处理业务，
 *
 * @author yechao
 * @date 2018/12/21
 */
public interface SysFileService {

    Long save(SysFile sysFile);

    int delete(Long id);

    int update(SysFile sysFile);

    SysFile get(Long id);

    List<SysFile> list();

}
