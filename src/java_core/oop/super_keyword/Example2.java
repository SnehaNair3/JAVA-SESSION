package java_core.oop.super_keyword;

class Vehicle {
	void accelerate() {
		System.out.println("Vehicle accelerating..");
	}
}

class Cars extends Vehicle {
	void accelerate() {
		System.out.println("Car accelerating..");
	}

	void display() {
		accelerate();
		super.accelerate();
	}
}

public class Example2 {
	public static void main(String[] args) {
		Cars cars = new Cars();
		cars.accelerate();
		cars.display();
	}
}
