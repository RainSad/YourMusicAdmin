package com.core.dao.sys;

import com.core.model.sys.sysResources;

public interface sysResourcesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysResources record);

    int insertSelective(sysResources record);

    sysResources selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysResources record);

    int updateByPrimaryKey(sysResources record);
}