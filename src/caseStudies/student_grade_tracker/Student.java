package caseStudies.student_grade_tracker;

import java.util.Arrays;

public class Student {
	private int id;
	private String name;
	private int[] marks = new int[3];
	double avg = 0;
	char grade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public void setGrade(char grade) {
		this.grade = grade;
	}

	

	public char getGrade() {
		return grade;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", avg=" + avg
				+ ", grade=" + grade + "]";
	}

	public double calculateAverage() {

		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		avg = sum / marks.length;
		return avg;

	}

	public char calculateGrade() {
		double avg = calculateAverage();
		// System.out.printf("Average: %.2f", avg);
		if (avg >= 90) {
			return 'A';
		} else if ((avg < 90) && (avg >= 75)) {
			return 'B';
		} else if ((avg < 75) && (avg >= 50)) {
			return 'C';
		} else {
			return 'D';
		}
	}

	

}
