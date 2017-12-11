package com.core.ztx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.core.ztx.dao.mapper.UserMapper;
import com.core.ztx.entity.User;
import com.core.ztx.service.UserService;

@Service("userService")
@Qualifier("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void insertTest()  {
    	User user = new User();
    	user.setLoginName("李四");
    	user.setLoginPass("123456");
    	userMapper.insertSelective(user);
    	System.out.println(user.toString());
    	//throw new RuntimeException("test");
	}
}
