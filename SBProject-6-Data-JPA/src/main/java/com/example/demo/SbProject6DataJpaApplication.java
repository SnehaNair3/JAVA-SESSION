package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.StudentServiceImpl;

@SpringBootApplication
public class SbProject6DataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SbProject6DataJpaApplication.class, args);
		StudentService stdService = context.getBean(StudentServiceImpl.class);

		// INSERT
//		Student std = new Student();
//		std.setName("Bhavya");
//		std.setRollno(2);
//		std.setMarks(87f);
//
//		boolean insert = stdService.addStudentDetails(std);
//		if (insert) {
//			System.out.println("Student inserted successfully.");
//		} else {
//			System.out.println("Student not inserted.");
//		}

		// SELECT ALL
		List<Student> stdList = stdService.getAllStudents();
		for (Student std : stdList) {
			System.out.println("ID : " + std.getId());
			System.out.println("Name : " + std.getName());
			System.out.println("Roll No : " + std.getRollno());
			System.out.println("Marks : " + std.getMarks());
			System.out.println("-------------------");
		}

		// SELECT BY ID
		Student std = stdService.getStudentById(8);

		if (std != null) {
			System.out.println("ID : " + std.getId());
			System.out.println("Name : " + std.getName());
			System.out.println("Roll No : " + std.getRollno());
			System.out.println("Marks : " + std.getMarks());
			System.out.println("-------------------");
		} else {
			System.out.println("Student not found.");
		}

		// UPDATE
		boolean update = stdService.updateStudentDetails(1, 56f);
		if (update) {
			System.out.println("Updated successfully.");
		} else {
			System.out.println("Failed to update");
		}

		// DELETE
		boolean delete = stdService.deleteStudent(2);
		if (delete) {
			System.out.println("Deleted successfully.");
		} else {
			System.out.println("Failed to delete.");
		}

	}

}
