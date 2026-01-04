package java_core.oop.object_methods;

class Book {
	String title;

	public Book(String title) {
		super();
		this.title = title;
	}

	@Override
	public boolean equals(Object obj) {

		Book b = (Book) obj;

		return this.title.equals(b.title);

	}

}

public class EqualsMethod {

	public static void main(String[] args) {
		Book b1 = new Book("Java");
		Book b2 = new Book("Python");
		Book b3 = new Book("Java");

		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
	}
}
