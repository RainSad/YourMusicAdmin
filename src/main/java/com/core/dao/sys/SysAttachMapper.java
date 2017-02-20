package com.core.dao.sys;

import com.core.model.sys.SysAttach;

public interface SysAttachMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAttach record);

    int insertSelective(SysAttach record);

    SysAttach selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAttach record);

    int updateByPrimaryKey(SysAttach record);
}