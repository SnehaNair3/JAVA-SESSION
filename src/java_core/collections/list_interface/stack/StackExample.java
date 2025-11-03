package java_core.collections.list_interface.stack;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {

		Stack<String> sub = new Stack<String>();

		sub.push("Java");
		sub.push("C");
		sub.push("Spring");
		sub.push("Hibernate");
		sub.push("Python");
		sub.push("DSA");

		System.out.println("After adding elements : " + sub);

		System.out.println("Pop : " + sub.pop());

		System.out.println("Peek : " + sub.peek());

		System.out.println("Search : " + sub.search("C"));

		System.out.println("Empty :" + sub.empty());

	}
}
