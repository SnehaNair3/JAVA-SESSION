package java_core.collections.list_interface;

import java.util.ArrayList;
import java.util.List;

public class AllMethodsExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Pen");
		list.add("Pencil");
		list.add("Eraser");
		list.add("Ruler");
		list.add("Book");
		list.add("Bag");
		list.add("Box");
		list.add("Compass");
		System.out.println(list);

		// update
		list.set(7, "ID Card");
		System.out.println(list);

		// remove
		list.remove(7);
		System.out.println(list);
		list.remove("Box");
		System.out.println(list);

		// find element
		System.out.println("Index 3 : " + list.indexOf(3));
		System.out.println("Index Bag: " + list.indexOf("Bag"));

		// accessing element
		System.out.println("Get 2 : " + list.get(2));

		// check if contains
		System.out.println("Check pen" + list.contains("Pen"));

		// iterating
		for (String s : list) {
			System.out.print(s + " ");
		}
	}
}
