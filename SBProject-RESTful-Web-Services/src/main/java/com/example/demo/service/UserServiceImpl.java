package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(int id) {
		return userRepository.findById(id);
	}

	@Override
	public User updateUserDetails(int id, User newUser) {
		User updateUser = userRepository.findById(id).orElse(null);
		if (updateUser != null) {
			return userRepository.save(newUser);
		} else {
			throw new RuntimeException("User not found with ID  : " + id);
		}
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);

	}

}
