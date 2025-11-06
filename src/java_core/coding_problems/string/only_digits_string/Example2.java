package java_core.coding_problems.string.only_digits_string;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  the string : ");
		String str = scanner.nextLine();
		System.out.println(" String contains only digits : " + checkOnlyDigits(str));
	}

	public static boolean checkOnlyDigits(String str) {
		return str.matches("\\d+");
	}
}
