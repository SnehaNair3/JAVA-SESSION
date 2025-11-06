package java_core.coding_problems.string.reverse_string;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = scanner.nextLine();
		System.out.println("Original string is : " + str);
		reverseString(str);
		
	}

	public static void reverseString(String input) {

		char ch;
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			result = ch + result;
		}

		System.out.println("Reversed string is : " + result);
	}
}
