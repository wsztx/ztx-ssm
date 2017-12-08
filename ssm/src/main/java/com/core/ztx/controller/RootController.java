package com.core.ztx.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.ztx.service.UserService;

@Controller
public class RootController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}
