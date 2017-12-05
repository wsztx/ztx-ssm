package com.core.ztx.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.ztx.service.UserService;

@Controller
public class RootController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(){
		return "index";
	}
}
