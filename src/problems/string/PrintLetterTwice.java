package problems.string;

import java.util.Scanner;

public class PrintLetterTwice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = scanner.nextLine();
		String doubledString = doubleCharacters(input);
		System.out.println(doubledString);
	}

	public static String doubleCharacters(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			result.append(ch).append(ch);
		}
		return result.toString();
	}
}
