package java_core.oop.abstraction;

abstract class Shape {
	String color;

	// abstract methods
	abstract double calculateArea();

	public abstract String toString();

	// constructor
	public Shape(String color) {
		System.out.println("Shape constructor called.");
		this.color = color;
	}

	// non-sbstract method
	public String getColor() {
		return color;
	}
}

class Circle extends Shape {
	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
		System.out.println("Circle constructor called.");
	}

	@Override
	double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {

		return "Circle color is " + super.getColor() + " and area is : " + calculateArea();
	}

}

class Rectangle extends Shape {
	public Rectangle(String color, double length, double breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
		System.out.println("Rectangle constructor called.");
	}

	double length;
	double breadth;

	@Override
	double calculateArea() {
		return 2 * length * breadth;
	}

	@Override
	public String toString() {
		return "Rectangle color is : " + super.getColor() + " and area is : " + calculateArea();
	}

}

public class UsingAbstractClass {
	public static void main(String[] args) {
		Shape c = new Circle("Red", 10);
		System.out.println("CIRCLE : ");
		System.out.println(c.calculateArea());
		System.out.println(c.getColor());
		System.out.println(c.toString());

		Shape r = new Rectangle("Blue", 2, 2);
		System.out.println("RECTANGLE : ");
		System.out.println(r.calculateArea());
		System.out.println(r.getColor());
		System.out.println(r.toString());
	}
}
