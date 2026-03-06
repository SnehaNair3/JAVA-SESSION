package java_core.collections.iterable_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraverseRemoveOddElements {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		System.out.println("list : " + list);

		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {
			Integer num = it.next();

			if (num % 2 != 0) {
				it.remove();
			}
		}

		System.out.println("After removing odd elemets : ");
		System.out.println(list);
	}
}
