package java_core.collections.set_interface.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparator {
	public static void main(String[] args) {
		// Creating a TreeSet with a custom Comparator
		Set<StringBuffer> ts = new TreeSet<>(new Comparator<StringBuffer>() {

			@Override
			public int compare(StringBuffer o1, StringBuffer o2) {
				return o2.toString().compareTo(o1.toString());
			}

		});

		ts.add(new StringBuffer("Apple"));
		ts.add(new StringBuffer("Banana"));
		ts.add(new StringBuffer("Orange"));
		ts.add(new StringBuffer("Kiwi"));
		ts.add(new StringBuffer("Cherry"));

		System.out.println(ts);

	}
}
