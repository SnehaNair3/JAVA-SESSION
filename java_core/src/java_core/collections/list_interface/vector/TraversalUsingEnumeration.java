package java_core.collections.list_interface.vector;

import java.util.Enumeration;
import java.util.Vector;

public class TraversalUsingEnumeration {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();

		v.add("English");
		v.add("French");
		v.add("German");
		v.add("Hindi");
		v.add("Spanish");

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
