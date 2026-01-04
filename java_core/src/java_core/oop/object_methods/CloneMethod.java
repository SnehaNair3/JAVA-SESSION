package java_core.oop.object_methods;

class Animal implements Cloneable {
	String name = "Dog";
	int age = 2;

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}

public class CloneMethod {
	public static void main(String[] args) throws CloneNotSupportedException {
		Animal animal1 = new Animal();

		Animal animal2 = (Animal) animal1.clone();

		System.out.println(animal1.name);
		System.out.println(animal2.name);
		System.out.println(animal2.age);
		System.out.println(animal2.age);
	}
}
