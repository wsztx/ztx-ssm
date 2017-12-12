package com.core.ztx.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.ztx.annotation.UserAnnotation;
import com.core.ztx.comm.ResModel;
import com.core.ztx.entity.Member;
import com.core.ztx.entity.User;
import com.core.ztx.service.UserService;

@Controller
@RequestMapping("/test")
public class TestController {

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
	
	@ResponseBody
	@RequestMapping(value="/{userId}", method=RequestMethod.GET)
	public ResModel doTest(@PathVariable("userId") Long userId){
		ResModel model = new ResModel();
		User user = userService.getUserById(userId);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("user", user);
		model.setCode("success");
		model.setMessage("操作成功");
		model.setData(map);
		return model;
	}
}
