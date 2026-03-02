package java_core.oop.abstraction;

interface TestInterface {
	int a = 100;

	default void test() {
		System.out.println("Default method.");
	}
}

public class DefaultClassExample implements TestInterface {
	public static void main(String[] args) {
		DefaultClassExample de = new DefaultClassExample();
		de.test();
		System.out.println("a : " + de.a);
	}
}
