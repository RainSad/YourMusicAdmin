package com.core.dao.sys;

import com.core.model.sys.sysDepartment;

public interface sysDepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysDepartment record);

    int insertSelective(sysDepartment record);

    sysDepartment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysDepartment record);

    int updateByPrimaryKey(sysDepartment record);
}