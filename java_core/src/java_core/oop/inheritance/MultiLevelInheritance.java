package java_core.oop.inheritance;

class Vehicle {
	void start() {
		System.out.println("Starting engine.");
	}
}

class FourWheeler extends Vehicle {
	void accelerate() {
		System.out.println("accelerating.");
	}
}

class Car extends FourWheeler {
	void start() {
		System.out.println("Car started.");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.accelerate();
	}
}
