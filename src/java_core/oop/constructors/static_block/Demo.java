package java_core.oop.constructors.static_block;

class Parent {
	static void staticMethod() {

		System.out.println("Parent static method");
	}

	void instanceMethod() {

		System.out.println("Parent instance method");
	}
}

class Child extends Parent {

	static void staticMethod() {

		// Hides Parent's static method
		System.out.println("Child static method");
	}

	@Override
	void instanceMethod() {

		// Overrides Parent's instance method
		System.out.println("Child instance method");
	}
}

public class Demo {

	public static void main(String[] args) {

		Parent p = new Child();

		// Calls Parent's static method (hiding)
		p.staticMethod();

		// Calls Child's overridden instance method
		p.instanceMethod();
	}
}
