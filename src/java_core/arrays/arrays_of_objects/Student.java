package java_core.arrays.arrays_of_objects;

public class Student {
	String name;
	int age;
	String city;

	public Student(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}
