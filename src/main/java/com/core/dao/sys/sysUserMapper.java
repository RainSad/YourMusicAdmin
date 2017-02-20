package com.core.dao.sys;

import com.core.model.sys.sysUser;

public interface sysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysUser record);

    int insertSelective(sysUser record);

    sysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysUser record);

    int updateByPrimaryKey(sysUser record);
}