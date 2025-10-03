package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

	public boolean registerUser(User user);

	public User login(String email, String password);
}
