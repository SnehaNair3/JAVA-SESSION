package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;

@SpringBootApplication
public class SbProject5JdbcCrudApplication implements CommandLineRunner {

	@Autowired
	private UserDAO userDAO;

	public static void main(String[] args) {
		SpringApplication.run(SbProject5JdbcCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);

		// INSERTION
//		System.out.println("Enter user details : ");
//		System.out.println("Enter user name : ");
//		String name = sc.nextLine();
//		System.out.println("Enter user email : ");
//		String email = sc.nextLine();
//		System.out.println("Enter user gender : ");
//		String gender = sc.nextLine();
//		System.out.println("Enter user city : ");
//		String city = sc.nextLine();

		// User user1 = new User(name, email, gender, city);
//		User user2 = new User(name, email, gender, city);
		// User user3 = new User(name, email, gender, city);

//		boolean status = userDAO.insertUser(user3);
//
//		if (status) {
//			System.out.println("User inserted successfully.");
//		} else {
//			System.out.println("Failed to insert.");
//		}

		// UPDATION - 1
//		System.out.println("Enter email to update : ");
//		String email = sc.nextLine();
//		System.out.println("Enter name : ");
//		String name = sc.nextLine();
//		System.out.println("Enter gender : ");
//		String gender = sc.nextLine();
//		System.out.println("Enter city : ");
//		String city = sc.nextLine();
//		User user = new User(name, email, gender, city);
//		boolean update = userDAO.updateUser(user);
//		if (update) {
//			System.out.println("updation success.");
//		} else {
//			System.out.println("updation failed.");
//		}

		// UPDATION - 2
//		System.out.println("Enter email to update : ");
//		String updateEmail = sc.nextLine();
//		User user = userDAO.getUserByEmail(updateEmail);
//		System.out.println("Update name : ");
//		String updateName = sc.nextLine();
//		System.out.println("Update gender : ");
//		String updateGender = sc.nextLine();
//		System.out.println("Update city : ");
//		String updateCity = sc.nextLine();
//
//		user.setName(updateName);
//		user.setGender(updateGender);
//		user.setCity(updateCity);
//
//		boolean update = userDAO.updateUser(user);
//		if (update) {
//			System.out.println("updation success.");
//		} else {
//			System.out.println("updation failed.");
//		}

		// DELETION
		System.out.println("Enter the user email to delete : ");
		String deleteEmail=sc.nextLine();
		boolean delete=userDAO.deleteUserByEmail(deleteEmail);
		if(delete) {
			System.out.println("deletion sucess.");
		}else {
			System.out.println("deletion failed.");
		}

		// SELECT ONE USER
//		System.out.println("Enter user email to fetch : ");
//		String selectEmail=sc.nextLine();
//		User user=userDAO.getUserByEmail(selectEmail);
//		System.out.println("Name : " + user.getName());
//		System.out.println("Email : " + user.getEmail());
//		System.out.println("Gender : "+ user.getGender());
//		System.out.println("City : " + user.getCity());

		// SELECT ALL USERS
//		List<User> users = userDAO.getAllUsers();
//		for (User user : users) {
//			System.out.println("Name : " + user.getName());
//			System.out.println("Email : " + user.getEmail());
//			System.out.println("Gender : " + user.getGender());
//			System.out.println("City : " + user.getCity());
//			System.out.println("------------------------------------");
//		}

	}

}
