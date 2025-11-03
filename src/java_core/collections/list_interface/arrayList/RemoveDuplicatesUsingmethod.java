package java_core.collections.list_interface.arrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesUsingmethod {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(20);
		list.add(30);
		list.add(80);
		list.add(20);
		list.add(10);
		list.add(30);

		System.out.println("List : " + list);

		list = removeDuplicate(list);
		System.out.println("Without duplicates : " + list);
	}

	public static List<Integer> removeDuplicate(List<Integer> list) {
		List<Integer> l = new ArrayList<Integer>();

		for (Integer i : list) {
			if (!l.contains(i)) {
				l.add(i);
			}
		}

		return l;
	}
}
