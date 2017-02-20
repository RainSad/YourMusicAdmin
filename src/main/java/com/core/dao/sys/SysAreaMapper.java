package com.core.dao.sys;

import com.core.model.sys.SysArea;

public interface SysAreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysArea record);

    int insertSelective(SysArea record);

    SysArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysArea record);

    int updateByPrimaryKey(SysArea record);
}