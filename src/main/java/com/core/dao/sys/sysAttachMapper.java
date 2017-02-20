package com.core.dao.sys;

import com.core.model.sys.sysAttach;

public interface sysAttachMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysAttach record);

    int insertSelective(sysAttach record);

    sysAttach selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysAttach record);

    int updateByPrimaryKey(sysAttach record);
}