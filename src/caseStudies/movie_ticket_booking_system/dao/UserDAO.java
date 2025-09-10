package caseStudies.movie_ticket_booking_system.dao;

import java.util.ArrayList;
import java.util.List;

import caseStudies.movie_ticket_booking_system.model.User;

public class UserDAO {
	private List<User> users = new ArrayList<User>();

	// Add new user (registration)
	public void addUser(User user) {
		users.add(user);
	}

	// Get all users
	public List<User> getAllUsers() {
		return users;
	}

	// get user by id
	public User getUserById(int id) {
		for (User user : users) {
			if (user.getUserId() == id) {
				return user;
			}
		}
		return null;
	}

	// Get user by username
	public User getUserByUsername(String username) {
		for (User user : users) {
			if (user.getUsername().equalsIgnoreCase(username)) {
				return user;
			}
		}
		return null;
	}

	// Validate login
	public User validateUser(String username, String password) {
		for (User user : users) {
			if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

	// Delete user by ID
	public boolean deleteUser(int id) {
		return users.removeIf(b -> b.getUserId() == id);
	}
}
