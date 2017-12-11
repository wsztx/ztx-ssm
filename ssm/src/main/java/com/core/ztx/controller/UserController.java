package com.core.ztx.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.ztx.annotation.UserAnnotation;
import com.core.ztx.entity.Member;
import com.core.ztx.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	@UserAnnotation
	private UserService userService;
	
	@Autowired(required=false)
	private Member member;
	
	@RequestMapping("/test")
	public String test() throws Exception{
		if(member==null){
			System.out.println("ssssssssssssss");
		}else{
			System.out.println(member.toString());
		}
		userService.insertTest();
		return "index";
	}

	@ResponseBody
	@RequestMapping("/login")
	public Map login(){
		Map resultMap = new HashMap();
		
		return resultMap;
	}
}
