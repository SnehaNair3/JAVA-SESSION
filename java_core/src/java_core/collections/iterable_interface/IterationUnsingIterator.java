package java_core.collections.iterable_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationUnsingIterator {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();

		fruits.add("Apple");
		fruits.add("Grape");
		fruits.add("Kiwi");
		fruits.add("Banana");

		Iterator<String> it = fruits.iterator();

		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
	}
}
