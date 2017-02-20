package com.core.dao.sys;

import com.core.model.sys.sysDictionary;

public interface sysDictionaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysDictionary record);

    int insertSelective(sysDictionary record);

    sysDictionary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysDictionary record);

    int updateByPrimaryKey(sysDictionary record);
}