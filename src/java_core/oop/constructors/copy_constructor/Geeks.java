package java_core.oop.constructors.copy_constructor;

public class Geeks {

	String name;
	int age;

	public Geeks(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Default constructor called.");
	}

	Geeks(Geeks another) {
		this.name = another.name;
		this.age = another.age;
		System.out.println("Copy constructor called.");
	}

	@Override
	public String toString() {
		return "Geeks [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Geeks geeks1 = new Geeks("Sneha", 20);
		System.out.println();
		Geeks geeks2 = new Geeks(geeks1);

		System.out.println("First object : " + geeks1);
		System.out.println("Second object : " + geeks2);
	}

}
