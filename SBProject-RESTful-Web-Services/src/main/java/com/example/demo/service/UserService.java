package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.User;

public interface UserService {

	public User createUser(User user);

	public List<User> getAllUsers();

	public Optional<User> getUserById(int id);

	public User updateUserDetails(int id, User user);

	public void deleteUser(int id);
}
