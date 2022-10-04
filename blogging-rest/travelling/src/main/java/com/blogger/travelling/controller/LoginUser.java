package com.blogger.travelling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogger.travelling.model.User;
import com.blogger.travelling.service.UserService;

@RestController
@RequestMapping("/login")
public class LoginUser {
	
	@Autowired 
	UserService us;

	@PostMapping
	public boolean loginUser(@RequestBody User user)
	{
		User res = us.loginUser(user.getEmailId(), user.getPassword());
		if(res != null)
		{
			return true;
			
		}
		else
		{
			return false;
		}
		
	}
}
