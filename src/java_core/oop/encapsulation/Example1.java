package java_core.oop.encapsulation;

class Person {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Example1 {
	public static void main(String[] args) {
		Person person = new Person();
		person.setId(101);
		person.setName("Maya");

		System.out.println("Person ID : " + person.getId());
		System.out.println("Person name : " + person.getName());
	}
}
