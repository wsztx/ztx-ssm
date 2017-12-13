package com.core.ztx.service;

import com.core.ztx.entity.User;

public interface UserService {

	User login(String loginName, String loginPass);
	
	User getUserById(Long id);
	
	Long countByUser(User user);
	
	void insertTest();
}
