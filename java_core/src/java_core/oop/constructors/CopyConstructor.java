package java_core.oop.constructors;

class Person {
	String name;
	String city;

	// parameterized constructor
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	// copy constructor
	Person(Person obj2) {
		this.name = obj2.name;
		this.city = obj2.city;
	}

}

public class CopyConstructor {
	public static void main(String[] args) {

		// object from parameterized constructor
		Person p1 = new Person("Arya", "Mumbai");
		System.out.println("Object 1 ");
		System.out.println("Name : " + p1.name + "  City : " + p1.city);

		// object from copied constructor
		Person p2 = new Person(p1);
		System.out.println("Object 1 ");
		System.out.println("Name : " + p2.name + "  City : " + p2.city);
	}
}
