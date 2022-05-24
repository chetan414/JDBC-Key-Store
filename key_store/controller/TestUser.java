package com.ty.key_store.controller;

import com.ty.key_store.dto.User;
import com.ty.key_store.service.UserService;

public class TestUser
{
	public static void main(String[] args) 
	{
		User user = new User();
		user.setUid(1);
		user.setName("chetan");
		user.setEmail("chetu554@gmail.com");
		user.setPassword("chetan554");
		
		UserService service = new UserService();
		
		int res = service.saveUser(user);
		if(res>0)
		{
			System.out.println("Data inserted successfully");
		}
		else
			System.out.println("Something went wrong");
	}
}

