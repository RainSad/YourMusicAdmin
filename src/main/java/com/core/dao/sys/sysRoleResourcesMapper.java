package com.core.dao.sys;

import com.core.model.sys.sysRoleResourcesKey;

public interface sysRoleResourcesMapper {
    int deleteByPrimaryKey(sysRoleResourcesKey key);

    int insert(sysRoleResourcesKey record);

    int insertSelective(sysRoleResourcesKey record);
}