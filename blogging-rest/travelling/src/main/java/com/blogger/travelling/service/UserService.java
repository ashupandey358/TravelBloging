package com.blogger.travelling.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogger.travelling.model.User;
import com.blogger.travelling.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository ur;

	public void saveUser(User user)
	{
		ur.save(user);
	}
	public User getUserByid(int id) {
		
		Optional<User> users = ur.findById(id);
		return users.get();
	}
	
	public List<User> getAllUser(){
		return ur.findAll();
	}
	
	public User loginUser(String username, String password)
	{
		return ur.loginUser(username, password);
	}
}
