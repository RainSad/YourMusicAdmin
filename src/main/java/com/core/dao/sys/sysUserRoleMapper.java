package com.core.dao.sys;

import com.core.model.sys.sysUserRoleKey;

public interface sysUserRoleMapper {
    int deleteByPrimaryKey(sysUserRoleKey key);

    int insert(sysUserRoleKey record);

    int insertSelective(sysUserRoleKey record);
}