package com.core.dao.sys;

import com.core.model.sys.sysRole;

public interface sysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysRole record);

    int insertSelective(sysRole record);

    sysRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysRole record);

    int updateByPrimaryKey(sysRole record);
}