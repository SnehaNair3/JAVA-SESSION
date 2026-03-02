package java_core.oop.interfaces;

class Outer {
	interface Inner {
		void display();
	}
}

public class NestedInterfaceInsideClass implements Outer.Inner {

	@Override
	public void display() {
		System.out.println("Display movies.");

	}

	public static void main(String[] args) {
		Outer.Inner obj = new NestedInterfaceInsideClass();

		obj.display();
	}

}
