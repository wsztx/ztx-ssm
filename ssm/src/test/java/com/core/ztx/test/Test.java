package com.core.ztx.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.ztx.entity.Member;

public class Test extends BaseJunit4Test {
	
	@Autowired
	private Member member;

//	@Autowired
//	private UserMapper userMapper;
	
/*    @org.junit.Test   //标明是测试方法  
    public void insertTest() {
    	UserMapper userMapper = SpringApplicationContextUtils.getBean(UserMapper.class);
    	User user2 = new User("李四", "123456");
    	userMapper.insert(user2);
    	System.out.println(user2.toString());
    	//throw new RuntimeException("test");
    }  */
    
    @org.junit.Test
    public void profileTest(){
    	System.out.println("kkkkkkkkkkkkkkkk");
    	if(member!=null){
    		System.out.println(member.toString());
    	}else{
    		System.out.println("sssssssssss");
    	}
    }
}
