package java_core.oop.constructors;

class Place {
	String name;
	String state;
	String country;

	// default constructor
	public Place() {
		this("Asia");
		System.out.println("Default constructor called.");
	}

	public Place(String name) {
		this("Great wall", "Shenzeng");
		System.out.println("Name : " + name);
		System.out.println("Single para constructor called.");
	}

	// parameterized constructor
	public Place(String name, String state) {
		this("Great wall", "Shenzeng", "China");
		this.name = name;
		this.state = state;
		System.out.println("Double para constructor called.");
	}

	public Place(String name, String state, String country) {
		this.name = name;
		this.state = state;
		this.country = country;
		System.out.println("3 para constructor called.");
	}

}

public class ConstructorChaining {
	public static void main(String[] args) {
		new Place();
	}
}
