package com.core.dao.sys;

import com.core.model.sys.sysArea;

public interface sysAreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysArea record);

    int insertSelective(sysArea record);

    sysArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysArea record);

    int updateByPrimaryKey(sysArea record);
}