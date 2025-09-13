package problems.string;

import java.util.Scanner;

public class SeperateCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input = scanner.nextLine();
		System.out.println("Original string is : " + input);
		seperateCharacters(input);
	}

	public static void seperateCharacters(String str) {
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder upperCase = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (Character.isLowerCase(ch)) {
				lowerCase.append(ch);
			} else {
				upperCase.append(ch);
			}
		}
		System.out.println("Lower case characters : " + lowerCase);
		System.out.println("Upper case characters : " + upperCase);
	}
}
