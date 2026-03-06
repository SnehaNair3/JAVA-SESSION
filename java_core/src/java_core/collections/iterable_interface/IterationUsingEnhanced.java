package java_core.collections.iterable_interface;

import java.util.ArrayList;
import java.util.List;

public class IterationUsingEnhanced {
	public static void main(String[] args) {
		List<String> books = new ArrayList<String>();

		books.add("Alchemist");
		books.add("Kite runner");
		books.add("Sherlock Holmes");
		books.add("Pride and prejudice");

		for (String b : books) {
			System.out.println(b);
		}
	}
}
