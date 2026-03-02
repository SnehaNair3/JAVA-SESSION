package java_core.oop.inheritance;

interface Maths {
	default void calculate() {
		System.out.println("Learn calculations.");
	}
}

interface English {
	default void speak() {
		System.out.println("Learn speaking.");
	}

}

class Subject implements Maths, English {

	public Subject() {
		System.out.println("This is  a subject.");
	}

}

public class MultipleInheritance {
	public static void main(String[] args) {
		Subject sub = new Subject();
		sub.calculate();
		sub.speak();
	}
}
