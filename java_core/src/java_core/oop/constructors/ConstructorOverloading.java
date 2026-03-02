package java_core.oop.constructors;

class Box {
	int width;
	int height;
	int depth;

	// default constructor
	public Box() {
		System.out.println("Default constructor called.");
	}

	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		System.out.println("All parametrized constructor called.");
	}

	public Box(int width) {
		this();
		this.width = width;
		System.out.println("Single parametrized constructor called.");
	}

	public Box(int width, int height) {
		this();
		this.width = width;
		this.height = height;
		System.out.println("Double parametrized constructor called.");
	}

}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Box b1 = new Box();

		Box b2 = new Box(1, 2, 3);

		Box b3 = new Box(10, 20);

		Box b4 = new Box(50);
	}
}
