package com.ty.key_store.service;

import com.ty.key_store.dao.UserDao;
import com.ty.key_store.dto.User;

public class UserService{
	
	UserDao dao = new UserDao();
	
	public int saveUser(User user) {
		return dao.saveUser(user);
	}
}

