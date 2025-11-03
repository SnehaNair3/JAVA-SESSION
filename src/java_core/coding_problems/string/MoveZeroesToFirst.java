package java_core.coding_problems.string;

import java.util.Scanner;

public class MoveZeroesToFirst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		String modifiedString = rearrangeZeroToFirts(str);
		System.out.println("Zeroes moved to first : " + modifiedString);

	}

	public static String rearrangeZeroToFirts(String input) {
		StringBuilder digits = new StringBuilder();
		StringBuilder zeroes = new StringBuilder();

		for (char ch : input.toCharArray()) {
			if (Character.isDigit(ch)) {
				if (ch == '0') {
					zeroes.append(ch);
				} else {
					digits.append(ch);
				}
			}
		}

		return zeroes.toString() + digits.toString();

	}
}
