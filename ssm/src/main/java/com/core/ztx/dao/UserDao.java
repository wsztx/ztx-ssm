package com.core.ztx.dao;

import org.apache.ibatis.annotations.Param;

import com.core.ztx.entity.User;

public interface UserDao {
	
	User getUserByNameAndPass(@Param("loginName")String loginName, @Param("loginPass")String loginPass);

}
