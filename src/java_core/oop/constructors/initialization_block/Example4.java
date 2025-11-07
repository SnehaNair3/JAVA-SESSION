package java_core.oop.constructors.initialization_block;

class Student {
	public Student() {
		System.out.println("Default student constructor called.");
	}

	{
		System.out.println("Common code for all constructors called.");
	}

	public Student(String name, int age) {
		System.out.println("Prametrized student constructor called.");
	}
}

public class Example4 {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("-----");
		Student std2 = new Student("Ram", 20);
	}
}
