package java_core.coding_problems.string;

import java.util.Scanner;

public class MoveZeroesToEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		String result = rearrangeDigits(str);
		System.out.println("Output : " + result);

	}

	public static String rearrangeDigits(String str) {
		StringBuilder digits = new StringBuilder();
		StringBuilder zerodigits = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				if (ch == '0') {
					zerodigits.append(ch);
				} else {
					digits.append(ch);
				}
			}
		}

		return digits.toString() + zerodigits.toString();
	}
}
