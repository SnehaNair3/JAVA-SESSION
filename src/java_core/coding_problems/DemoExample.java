package java_core.coding_problems;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DemoExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  string : ");
		String str = sc.nextLine();

		String strWithoutSpaces = removeSpaces(str);
		System.out.println("String without spaces : " + strWithoutSpaces);

	}

	public static String removeSpaces(String input) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				sb.append(input.charAt(i));
			}
		}

		return sb.toString();
	}

}
