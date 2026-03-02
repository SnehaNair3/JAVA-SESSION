package java_core.oop.constructors;

class Person2 {
	
	String name;

	public Person2() {
		this("");
		System.out.println("Default person  constructor called.");
	}

	public Person2(String name) {
		this.name=name;
		System.out.println("Parameterized person constructor called.");
		System.out.println("Name : " + name);
	}
}

class Student extends Person2 {
	Student() {
		System.out.println("Default student constructor called.");
	}

	Student(String name) {
		super(name);
		System.out.println("Parameterized student constructor called.");
	}
}

public class ConstructorChainingToOtherClass {
	public static void main(String[] args) {
		Student std = new Student("Maya");
	}
}
