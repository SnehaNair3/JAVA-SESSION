package java_core.oop.abstraction;

interface Shapes {
	public static final String color = "Green";

	double calculateArea();

	abstract String display();
}

class Square implements Shapes {
	double side;

	public Square(double side) {
		super();
		System.out.println("Square constuctor called.");
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return side * side;
	}

	@Override
	public String display() {
		return "Square color is : " + color + " and area is : " + calculateArea();
	}
}

class Triangle implements Shapes {
	double base;
	double height;

	public Triangle(double base, double height) {
		super();
		System.out.println("Triangle constructor called.");
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}

	@Override
	public String display() {
		return "Triangle color is : " + color + " and area is : " + calculateArea();
	}

}

public class UsingInterface {
	public static void main(String[] args) {
		System.out.println("SQAURE:  ");
		Shapes s = new Square(2);
		System.out.println(s.color);
		System.out.println(s.calculateArea());
		System.out.println(s.display());

		System.out.println("TRIANGLE : ");
		Shapes t = new Triangle(2, 2);
		System.out.println(t.color);
		System.out.println(t.calculateArea());
		System.out.println(t.display());

	}
}
