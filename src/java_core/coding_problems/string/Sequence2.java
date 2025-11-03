package java_core.coding_problems.string;

import java.util.Scanner;

public class Sequence2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();

		seperateCharacters(str);
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

		System.out.println("Lowercase letters : " + lowerCase);
		System.out.println("Uppercase letters : " + upperCase);
	}
}
