package java_core.collections.list_interface.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Earth");
		list.add("Moon");
		list.add("Sun");
		list.add("Mars");
		list.add("Saturn");
		System.out.println("List before synchronization : " + list);

		List<String> syncList = Collections.synchronizedList(list);
		System.out.println("List After synchronization : " + syncList);

	}
}
