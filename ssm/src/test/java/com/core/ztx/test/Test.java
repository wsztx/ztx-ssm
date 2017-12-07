package com.core.ztx.test;

import com.core.ztx.dao.mapper.UserMapper;
import com.core.ztx.entity.User;
import com.core.ztx.util.spring.SpringApplicationContextUtils;

public class Test extends BaseJunit4Test {

//	@Autowired
//	private UserMapper userMapper;
	
    @org.junit.Test   //标明是测试方法  
    public void insertTest() {
    	UserMapper userMapper = SpringApplicationContextUtils.getBean(UserMapper.class);
    	User user2 = new User("李四", "123456");
    	userMapper.insert(user2);
    	System.out.println(user2.toString());
    	//throw new RuntimeException("test");
    }  
}
