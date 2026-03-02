package java_core.oop.classes_and_objects;

class OuterClass {
	class InnerClass {
		void display() {
			System.out.println("Hello");
		}
	}
}

public class AnonymousObject2 {
	public static void main(String[] args) {
		new OuterClass().new InnerClass().display();
	}
}
