package java_core.oop.constructors;

class City {

	{
		System.out.println("Init block executed.");
	}

	City() {
		System.out.println("Default constructor called.");
	}

	City(String name) {
		this();
		System.out.println(name);
		System.out.println("Parameterized constructor called.");
	}
}

public class InitBlockExample {
	public static void main(String[] args) {
		new City("Sydney");

		System.out.println("-----------------------");

		new City("Seoul");
	}
}
