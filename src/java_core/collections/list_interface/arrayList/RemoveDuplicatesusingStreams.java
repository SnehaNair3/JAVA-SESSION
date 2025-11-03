package java_core.collections.list_interface.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesusingStreams {
	public static void main(String[] args) {
		List<String> numbers = new ArrayList<String>();

		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");
		numbers.add("Four");
		numbers.add("Two");
		numbers.add("Five");

		System.out.println("List : " + numbers);

		// List<String> updated =
		// numbers.stream().distinct().collect(Collectors.toList());

		// System.out.println("List without duplicates : " + updated);

		numbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Without duplicates : " + numbers);
	}
}
