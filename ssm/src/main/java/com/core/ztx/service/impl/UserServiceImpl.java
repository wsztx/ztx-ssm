package com.core.ztx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.ztx.entity.User;
import com.core.ztx.mapper.UserMapper;
import com.core.ztx.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void insertTest()  {
    	User user2 = new User("李四", "123456");
    	userMapper.insert(user2);
    	System.out.println(user2.toString());
	}
}
