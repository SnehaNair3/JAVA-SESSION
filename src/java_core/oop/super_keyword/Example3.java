package java_core.oop.super_keyword;

class Person {
	public Person() {
		System.out.println("Default person constructor called.");
	}

	public Person(String name) {
		System.out.println("Parameterized Person constructor called.");
	}
}

class Student extends Person {
	public Student() {
		super("name");
		System.out.println("Student default constructor called.");
	}

	public Student(String name) {
		super();
		System.out.println("Student parameterized constructor called.");
	}

}

public class Example3 {
	public static void main(String[] args) {
		Student std1 = new Student();
		System.out.println("---------------------------");
		Student std2 = new Student("Ram");
	}
}
