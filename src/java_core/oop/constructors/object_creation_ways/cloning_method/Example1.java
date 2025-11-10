package java_core.oop.constructors.object_creation_ways.cloning_method;

class Animal implements Cloneable {
	int x, y;

	public Animal() {
		super();
		x = 10;
		y = 20;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

public class Example1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Animal originalanimal = new Animal();

		Animal clonedAnimal = (Animal) originalanimal.clone();

		System.out.println("x : " + clonedAnimal.x);
		System.out.println("y : " + clonedAnimal.y);
	}
}
