package java_core.oop.abstract_class;

abstract class Subject {

	int pages = 100;

	public Subject() {
		System.out.println("Mathematics subject");
	}

	abstract void chapters();

	void book() {
		System.out.println("English language textbook with pages : " + pages);
	}
}

class IT extends Subject {

	@Override
	void chapters() {
		System.out.println("Chapters from 1 to 5 ");

	}

}

public class Example2 {
	public static void main(String[] args) {
		Subject it = new IT();
		it.chapters();
		it.book();

	}
}
