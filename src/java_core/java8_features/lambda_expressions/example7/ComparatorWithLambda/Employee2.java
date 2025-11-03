package java_core.java8_features.lambda_expressions.example7.ComparatorWithLambda;

public class Employee2 {
	private String name;
	private int age;

	public Employee2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", age=" + age + "]";
	}

}
