package java_core.design_patterns.singleton;

enum Singleton2 {
	INSTANCE;

	public void eat() {
		System.out.println("Eating...");
	}
}

public class Example2 {
	public static void main(String[] args) {
		Singleton2.INSTANCE.eat();
	}
}
