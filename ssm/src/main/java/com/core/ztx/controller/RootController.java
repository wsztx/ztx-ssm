package com.core.ztx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/*
	 * 登录页面
	 */
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	/*
	 * 首页
	 */
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
