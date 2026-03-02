package java_core.oop.abstraction;

interface Vehicle1 {
	private void startEngine() {
		System.out.println("Starting Engine.");
	}

	default void accelerate() {
		startEngine();
		System.out.println("Accelerating.");
	}
}

class Bike implements Vehicle1 {

}

public class PrivateMethodExample {
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.accelerate();
	}
}
