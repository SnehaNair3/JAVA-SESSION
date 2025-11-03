package java_core.collections.set_interface.linked_hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class BasicLinkedHashSet {
	public static void main(String[] args) {

		LinkedHashSet<String> color = new LinkedHashSet<String>();

		color.add("Blue");
		color.add("Orange");
		color.add("Yellow");
		color.add("Red");
		color.add("Green");

		// enhanced for loop
		System.out.println("enhanced for");
		for (String s : color) {
			System.out.println(s);
		}

		// iterator
		System.out.println("iterator");
		Iterator<String> it = color.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("forEach");
		// forEach
		color.forEach(col -> System.out.println(col));

		// stream
		System.out.println("stream");
		color.stream().forEach(col -> System.out.println(col));
	}
}
