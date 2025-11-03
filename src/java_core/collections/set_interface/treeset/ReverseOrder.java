package java_core.collections.set_interface.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ReverseOrder {
	public static void main(String[] args) {
		Set<String> months = new TreeSet<String>(Comparator.reverseOrder());

		months.add("January");
		months.add("February");
		months.add("April");
		months.add("March");
		months.add("November");

		System.out.println("TreeSEt : " + months);

		Set<Integer> years = new TreeSet<Integer>(Comparator.reverseOrder());

		years.add(1990);
		years.add(2356);
		years.add(2027);
		years.add(2000);
		years.add(1867);

		System.out.println("Descnding ordered : " + years);

	}
}
