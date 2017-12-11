package com.core.ztx.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.core.ztx.annotation.UserAnnotation;
import com.core.ztx.entity.Dictionary;
import com.core.ztx.service.UserService;
import com.core.ztx.util.spring.SpringApplicationContextUtils;

public class Test extends BaseJunit4Test {
	
	@Autowired
	@UserAnnotation
	private UserService userService;
	
//	@Autowired
//	private Member member;

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
    
/*    @org.junit.Test
    public void profileTest(){
    	Member member = SpringApplicationContextUtils.getBean("member2");
    	System.out.println("kkkkkkkkkkkkkkkk");
    	if(member!=null){
    		System.out.println(member.toString());
    	}else{
    		System.out.println("sssssssssss");
    	}
    }*/
    
/*    @org.junit.Test
    public void zyyTest(){
    	Dictionary dic = SpringApplicationContextUtils.getBean("dictionary");
    	System.out.println(dic.toString());
    	dic.setDicText("女");
    	System.out.println(dic.toString());
    	Dictionary dic2 = SpringApplicationContextUtils.getBean("dictionary");
    	System.out.println(dic2.toString());
    }*/
    
/*    @org.junit.Test
    public void propertySourceTest(){
    	Dictionary dic = SpringApplicationContextUtils.getBean("dic");
    	System.out.println(dic.toString());
    }*/
	
    @org.junit.Test
    public void AOPTest(){
    	userService.insertTest();
    }
}
