package java_core.collections.list_interface.arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates1 {
	public static void main(String[] args) {
		List<String> numbers = new ArrayList<String>();

		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");
		numbers.add("Four");
		numbers.add("Two");
		numbers.add("Five");

		System.out.println("List : " + numbers);

		Set<String> nset = new HashSet<String>(numbers);

		numbers.clear();
		numbers.addAll(nset);
		System.out.println("List without duplicates : " + numbers);

	}
}
