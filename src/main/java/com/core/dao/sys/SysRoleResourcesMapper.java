package com.core.dao.sys;

import com.core.model.sys.SysRoleResourcesKey;

public interface SysRoleResourcesMapper {
    int deleteByPrimaryKey(SysRoleResourcesKey key);

    int insert(SysRoleResourcesKey record);

    int insertSelective(SysRoleResourcesKey record);
}