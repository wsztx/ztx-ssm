package com.core.ztx.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.ztx.comm.Constants;
import com.core.ztx.comm.ResModel;
import com.core.ztx.entity.User;
import com.core.ztx.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping(value="doLogin")
	@ResponseBody
	public ResModel doLogin(HttpServletRequest request, @Valid User user, Errors errors){
		ResModel model = new ResModel();
		if(errors.hasErrors()){
			model.setCode("error");
			model.setMessage("参数验证失败");
			return model;
		}
		User loginUser = userService.login(user.getLoginName(), user.getLoginPass());
		if(loginUser==null){
			model.setCode("error");
			model.setMessage("用户密码错误");
		}else{
			request.getSession().setAttribute("user", loginUser);
			request.getSession().setMaxInactiveInterval(Constants.SESSION_TIME_OUT);
			model.setCode("success");
			model.setMessage("登录成功");
		}
		return model;
	}
	
	@RequestMapping(value="doLogout")
	public Map<String, Object> doLogout(){
		Map<String, Object> map = new HashMap<String, Object>();
		
		return map;
	}
}
