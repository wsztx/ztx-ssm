package com.core.ztx.dao;

import com.core.ztx.entity.User;

public interface UserMapper {

	User load(Long id);
	
	void insert(User user);
	
	void updateById(User user);
}
