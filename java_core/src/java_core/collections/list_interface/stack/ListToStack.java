package java_core.collections.list_interface.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListToStack {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Kiwi");

		System.out.println("List is : " + fruits);

		Stack<String> fs = new Stack<String>();

		System.out.println("Adding list to stack : " + fs.addAll(fruits));
		System.out.println("Stack is : " + fs);

	}
}
