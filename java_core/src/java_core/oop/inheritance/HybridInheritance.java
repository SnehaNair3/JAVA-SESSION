package java_core.oop.inheritance;

interface Animal {
	void eat();
}

interface Pet {
	void play();
}

class Mammal implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating");

	}
}

class Dog extends Mammal implements Pet {

	@Override
	public void play() {
		System.out.println("Dog plays.");

	}

	public void bark() {
		System.out.println("Dog barks.");
	}

}

public class HybridInheritance {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat(); //from Animal via Mammal
		dog.play(); // from Pet
		dog.bark(); // dog's own behaviour
	}
}
