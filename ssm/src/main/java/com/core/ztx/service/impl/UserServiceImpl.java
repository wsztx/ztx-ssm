package com.core.ztx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.core.ztx.dao.UserDao;
import com.core.ztx.dao.mapper.UserMapper;
import com.core.ztx.entity.User;
import com.core.ztx.entity.UserExample;
import com.core.ztx.service.UserService;
import com.core.ztx.util.MD5Util;

@Service("userService")
@Qualifier("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(String loginName, String loginPass) {
		loginPass = MD5Util.MD5(loginPass);
		return userDao.getUserByNameAndPass(loginName, loginPass);
	}
	
	@Override
	public void insertTest()  {
    	User user = new User();
    	user.setLoginName("李四");
    	user.setLoginPass("123456");
    	userMapper.insertSelective(user);
    	System.out.println(user.toString());
    	//throw new RuntimeException("test");
	}

	@Override
	public User getUserById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public Long countByUser(User user) {
		if(user!=null){
			UserExample example = new UserExample();
			example.createCriteria()
			    .andLoginNameEqualTo(user.getLoginName()==null?"":user.getLoginName());
			return userMapper.countByExample(example);
		}else{
			return 0L;
		}
	}
}
