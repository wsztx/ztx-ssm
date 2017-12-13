package com.core.ztx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.ztx.annotation.UserAnnotation;
import com.core.ztx.dao.mapper.UserMapper;
import com.core.ztx.entity.User;
import com.core.ztx.service.UserService;

@Service
@UserAnnotation
public class UserServiceImpl2 implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void insertTest() {
		// TODO Auto-generated method stub
		System.out.println("ssssssssssssssssss");
		throw new RuntimeException("test");
	}

	@Override
	public User login(String loginName, String loginPass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public Long countByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
