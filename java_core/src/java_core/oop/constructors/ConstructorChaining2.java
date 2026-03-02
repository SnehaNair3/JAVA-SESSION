package java_core.oop.constructors;

class Operation {

	// default
	public Operation() {
		System.out.println("Default constructor called.");
	}

	public Operation(int x) {
		this();
		System.out.println("x : " + x);
		System.out.println("1 parameterized constructor called.");
	}

	public Operation(int x, int y) {
		this(5);
		System.out.println("2 parameterized constructor called.");
		System.out.println("Result : "+x*y);
	}
}

public class ConstructorChaining2 {
	public static void main(String[] args) {
		new Operation(6, 10);
	}
}
