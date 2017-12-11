package com.core.ztx.service.impl;

import org.springframework.stereotype.Service;

import com.core.ztx.annotation.UserAnnotation;
import com.core.ztx.service.UserService;

@Service
@UserAnnotation
public class UserServiceImpl2 implements UserService {

	@Override
	public void insertTest() {
		// TODO Auto-generated method stub
		System.out.println("ssssssssssssssssss");
	}

}
