package com.core.ztx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.ztx.dao.mapper.UserMapper;
import com.core.ztx.entity.User;
import com.core.ztx.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void insertTest()  {
    	User user = new User();
    	user.setLoginName("李四");
    	user.setLoginPass("123456");
    	userMapper.insert(user);
    	System.out.println(user.toString());
    	throw new RuntimeException("test");
	}
}
