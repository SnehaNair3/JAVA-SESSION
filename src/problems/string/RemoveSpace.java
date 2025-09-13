package problems.string;

import java.util.Scanner;

public class RemoveSpace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = scanner.nextLine();
		String stringWithoutSpaces = removeSpaces(input);
		System.out.println(stringWithoutSpaces);
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
