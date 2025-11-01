package java_core.coding_problems.string;

import java.util.Scanner;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();

		System.out.println("String with spaces : " + str);
		String withoutSpaces = removeSpaces(str);
		System.out.println("String without spaces : " + withoutSpaces);
	}

	public static String removeSpaces(String str) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				result.append(str.charAt(i));
			}
		}

		return result.toString();
	}
}
