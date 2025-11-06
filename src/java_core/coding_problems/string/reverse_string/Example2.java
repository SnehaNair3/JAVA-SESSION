package java_core.coding_problems.string.reverse_string;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scanner.nextLine();
		System.out.println("Original string is : " + str);

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();

		System.out.println("Reversed string is : " + sb.toString());
	}
}
