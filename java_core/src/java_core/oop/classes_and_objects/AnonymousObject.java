package java_core.oop.classes_and_objects;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name : " + name + " - " + age);
	}

}

public class AnonymousObject {
	public static void main(String[] args) {
		//create an anonymous object and call its display method
       new Person("Neha",18).display();
	}
}
