package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	public boolean addStudentDetails(Student std);
	public List<Student> getAllStudents();
	public Student getStudentById(int id);
	public boolean updateStudentDetails(int id,float marks);
	public boolean deleteStudent(int id);
}
