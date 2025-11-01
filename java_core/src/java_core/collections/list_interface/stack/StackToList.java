package java_core.collections.list_interface.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackToList {
	public static void main(String[] args) {
		Stack<String> fs = new Stack<String>();
		fs.push("Apple");
		fs.push("Papaya");
		fs.push("Guava");
		fs.push("Plum");
		fs.push("Mango");
		System.out.println("Stack is : " + fs);

		List<String> fl = new ArrayList<String>();
		System.out.println("Adding stack elements to list : " + fl.addAll(fs));
		System.out.println("List after adding elements : " + fl);
	}
}
