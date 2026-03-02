package java_core.oop.inheritance;

class Vehicle2 {
	Vehicle2() {
		System.out.println("This is vehicle.");
	}
}

class Car2 extends Vehicle2 {
	Car2() {
		System.out.println("This is car.");
	}
}

class Bike extends Vehicle2 {
	Bike() {
		System.out.println("This is bike.");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Car2 c = new Car2();
		Bike b = new Bike();
	}
}
