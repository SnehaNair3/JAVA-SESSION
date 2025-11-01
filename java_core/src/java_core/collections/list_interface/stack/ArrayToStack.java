package java_core.collections.list_interface.stack;

import java.util.Stack;

public class ArrayToStack {
	public static void main(String[] args) {

		String[] strArray = { "Apple", "Banana", "Cherry", "Kiwi", "Papaya" };

		Stack<String> fruits = new Stack<String>();

		for (String s : strArray) {
			fruits.push(s);
		}

		System.out.println("Stack is : " + fruits);
	}
}
