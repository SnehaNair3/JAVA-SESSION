package java_core.collections.list_interface.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterationCheck {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			if (iterator.next() == 2) {
				// list.add(4); throws ConCurrentModificationException
				iterator.remove();
			}
		}
		System.out.println(list);
	}
}
