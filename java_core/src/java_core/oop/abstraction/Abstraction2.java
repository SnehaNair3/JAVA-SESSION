package java_core.oop.abstraction;

interface Add {
	int add(int x, int y);

	int multiply(int a,int b);
}

interface Sub {
	int subtract(int x, int y);

	int multiply(int a,int b);
}

class Calculator implements Add, Sub {

	@Override
	public int subtract(int x, int y) {
		return x - y;
	}

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int multiply(int a, int b) {

		return 2 * a * b;
	}

}

public class Abstraction2 {
	public static void main(String[] args) {
		Add obj1 = new Calculator();
		System.out.println("Add object");
		System.out.println(obj1.add(10, 20));
		System.out.println(obj1.multiply(2, 2));

		System.out.println("---------------");

		Sub obj2 = new Calculator();
		System.out.println("Sub object");
		System.out.println(obj2.subtract(10, 5));
		System.out.println(obj2.multiply(2, 3));
	}
}
