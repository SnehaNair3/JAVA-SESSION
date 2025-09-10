package caseStudies.student_grade_tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Student> al = new ArrayList<>();

		Student student;

		System.out.println("Enter the number of students : ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {

			student = new Student();
			System.out.println("Enter the student details for Student  : " + (i + 1));
			System.out.println("Enter the student ID : ");
			int id = scanner.nextInt();
			student.setId(id);
			System.out.println("Enter the student name : ");
			String name = scanner.next();
			student.setName(name);
			System.out.println("Enter the student marks : ");
			int[] marks = new int[3];
			for (int j = 0; j < 3; j++) {
				marks[j] = scanner.nextInt();

			}
			student.setMarks(marks);
			double average = student.calculateAverage();

			student.grade = student.calculateGrade();
			System.out.println(student.toString());
			// student.setGrade(student.calculateGrade());

			al.add(student);

		}
		System.out.println("Students information : ");
		for (Object o : al) {
			System.out.println(o);
		}
		scanner.close();
	}

}
