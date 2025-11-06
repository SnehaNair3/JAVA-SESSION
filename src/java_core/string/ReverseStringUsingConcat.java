package java_core.string;

import java.util.Scanner;

public class ReverseStringUsingConcat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scanner.nextLine();
		System.out.println("Original string is : " + str);
		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);

			String ch1 = Character.toString(ch);

			reverseStr=reverseStr.concat(ch1);
		}

		System.out.println("Reversed string is : " + reverseStr);
	}
}
