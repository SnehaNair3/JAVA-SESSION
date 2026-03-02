package java_core.oop.polymorphism;

class Calculator {
	int add(int x, int y) {
		return x + y;
	}

	double add(double x, double y) {
		return x + y;
	}

	int add(int x, int y, int z) {
		return x + y + z;
	}
}

public class CompileTimePoly {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.add(30.0, 40));
		System.out.println(cal.add(12, 12, 12));
	}
}
