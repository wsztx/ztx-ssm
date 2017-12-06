package com.core.ztx.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.ztx.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/test")
	public String test() throws Exception{
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
