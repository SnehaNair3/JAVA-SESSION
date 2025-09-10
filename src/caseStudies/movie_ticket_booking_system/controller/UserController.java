package caseStudies.movie_ticket_booking_system.controller;

import java.util.List;

import caseStudies.movie_ticket_booking_system.exception.UserNotFoundException;
import caseStudies.movie_ticket_booking_system.model.User;
import caseStudies.movie_ticket_booking_system.service.UserService;

public class UserController {
	private UserService userService;


	
	public UserController() {
	    this.userService = new UserService();
	}

	public UserController(UserService userService) {
		this.userService = userService;
	}

	// Register new user
	public void registerUser(User user) {
		try {
			userService.registerUser(user);
			System.out.println(" ✅ User registered successfully " + user.getUsername());
		} catch (IllegalArgumentException e) {
			System.out.println("❌Error " + e.getMessage());
		}
	}

	// List all users
	public void getAllUsers() {
		List<User> users = userService.getAllUsers();
		if (users.isEmpty()) {
			System.out.println("No users found..");
		} else {
			users.forEach(System.out::println);
		}
	}

	// Get user by ID
	public void getUserById(int id) {
		try {
			User user = userService.getUserById(id);
			System.out.println("User found : " + user);
		} catch (UserNotFoundException e) {
			System.out.println("❌Error : " + e.getMessage());
		}
	}

	// Login
	public void loginUser(String username, String password) {
		try {
			User user = userService.loginUser(username, password);
			System.out.println("✅Login successfull. Welcome " + user.getUsername());
		} catch (UserNotFoundException e) {
			System.out.println("❌ " + e.getMessage());
		}
	}

	// Delete user
	public void deleteUser(int id) {
		try {
			boolean deleted = userService.deleteUser(id);
			if (deleted) {
				System.out.println("✅User deleted successfully.");
			} else {
				System.out.println("❌Could not delete user.");
			}
		} catch (UserNotFoundException e) {
			System.out.println("❌ " + e.getMessage());
		}
	}

	public User loginUserAndReturn(String username, String password) {
		try {
			User user = userService.loginUser(username, password);
			System.out.println("✅ Login successful. Welcome " + user.getUsername());
			return user;
		} catch (UserNotFoundException e) {
			System.out.println("❌ " + e.getMessage());
			return null;
		}
	}

}
