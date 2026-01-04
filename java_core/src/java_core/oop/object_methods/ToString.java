package java_core.oop.object_methods;

class Student {
	String name = "Neha";
	int age = 23;

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}

public class ToString {
	public static void main(String[] args) {
		Student student = new Student();

		System.out.println(student.toString());
	}
}
