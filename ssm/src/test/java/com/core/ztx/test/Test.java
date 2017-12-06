package com.core.ztx.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.core.ztx.entity.User;
import com.core.ztx.mapper.UserMapper;

public class Test extends BaseJunit4Test {

	@Autowired
	private UserMapper userMapper;
	
    @org.junit.Test   //标明是测试方法  
    public void insertTest() {
    	User user2 = new User("李四", "123456");
    	userMapper.insert(user2);
    	System.out.println(user2.toString());
    	throw new RuntimeException("test");
    }  
}
