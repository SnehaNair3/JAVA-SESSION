package java_core.design_patterns.singleton;

class Singleton1 {
	private static Singleton1 obj;

	private Singleton1() {
		System.out.println("Object instantiated.");
	}

	public static Singleton1 getInstance() {
		if (obj == null) {
			obj = new Singleton1();
		}
		return obj;
	}

	public void doSomething() {
		System.out.println("Do something..");
	}
}

public class Example1 {
	public static void main(String[] args) {
		Singleton1.getInstance().doSomething();
	}

}
