package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

	public boolean registerUser(User user);
	public User loginuser(String email,String password);
}
