package com.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.sys.SysUserMapper;
import com.core.model.sys.SysUser;

@Service
public class SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	public SysUser userInfo(int id){
		return sysUserMapper.selectByPrimaryKey(id);
	}
}
