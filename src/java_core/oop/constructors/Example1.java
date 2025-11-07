package java_core.oop.constructors;

class Temp {
	Temp() {
		System.out.println("Default constructor called.");
	}

	Temp(int x) {
		this();
		System.out.println("Single parameterized constructor called.");
	}

	Temp(int x, int y) {
		this(5);
		System.out.println("Double parameterized constructor called.");
	}
}

public class Example1 {
	public static void main(String[] args) {
		Temp temp = new Temp(10,20);
	}
}
