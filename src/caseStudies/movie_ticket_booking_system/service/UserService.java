package caseStudies.movie_ticket_booking_system.service;

import java.util.List;

import caseStudies.movie_ticket_booking_system.dao.UserDAO;
import caseStudies.movie_ticket_booking_system.exception.UserNotFoundException;
import caseStudies.movie_ticket_booking_system.model.User;

public class UserService {
	private UserDAO userDAO;

	public UserService(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public UserService() {
		this.userDAO=new UserDAO();
	}

	// Register new user (only if username doesn't exist)
	public boolean registerUser(User user) {
		User existing = userDAO.getUserByUsername(user.getUsername());
		if (existing != null) {
			throw new IllegalArgumentException("Username already taken: " + user.getUsername());
		}
		userDAO.addUser(user);
		System.out.println("Registered successfully..");
		return true;
	}

	// Get all users
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

	// Get a specific user by ID
	public User getUserById(int userId) throws UserNotFoundException {
		User user = userDAO.getUserById(userId);
		if (user == null) {
			throw new UserNotFoundException("User not found with ID : " + userId);
		}
		return user;
	}

	// Login user
	public User loginUser(String username, String password) throws UserNotFoundException {
		User user = userDAO.validateUser(username, password);
		if (user == null) {
			throw new UserNotFoundException("Invalid username or password.");
		}
		return user;
	}

	// Delete a user by ID
	public boolean deleteUser(int userId) throws UserNotFoundException {
		User user = userDAO.getUserById(userId);
		if (user == null) {
			throw new UserNotFoundException("User not found with ID : " + userId);
		}
		return userDAO.deleteUser(userId);
	}

}
