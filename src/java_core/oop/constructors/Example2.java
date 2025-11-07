package java_core.oop.constructors;

class Person {
	String name;

	Person() {
		this("");
		System.out.println("Default Person constructor called.");
	}

	Person(String name) {
		this.name = name;
		System.out.println("Parameterized Person constructor called.");
	}
}

class Employee extends Person {
	public Employee() {
		super("");
		System.out.println("Default Employee constructor called.");
	}

	public Employee(String name) {
		super();
		System.out.println("Parameterized Employee constructor called.");
	}
}

public class Example2 {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		System.out.println("-------------");
		Employee employee2 = new Employee("Ram");
	}
}
