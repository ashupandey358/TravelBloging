package com.blogger.travelling.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogger.travelling.model.User;
import com.blogger.travelling.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService us;
	
	@PostMapping
	public void saveUserDetails(@RequestBody User user)
	{
		us.saveUser(user);
				
	}
	
	@GetMapping("/{id}")
	public User getById(@PathVariable int id) {
		return us.getUserByid(id);
		
	}
	
	@GetMapping
	public List<User> findAllUser()
	{
		 return us.getAllUser();
		
	}
	

	
	
}
