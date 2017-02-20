package com.core.dao.sys;

import com.core.model.sys.sysLog;

public interface sysLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysLog record);

    int insertSelective(sysLog record);

    sysLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysLog record);

    int updateByPrimaryKey(sysLog record);
}