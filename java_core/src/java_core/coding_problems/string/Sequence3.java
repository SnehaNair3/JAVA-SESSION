package java_core.coding_problems.string;

import java.util.Scanner;

public class Sequence3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		System.out.println("Original string is : "+str);
		System.out.println("Seperated string : ");
		seperateAlphaNumeric(str);
	}

	public static void seperateAlphaNumeric(String str) {
		StringBuilder alpha = new StringBuilder();
		StringBuilder numeric = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (Character.isLetter(ch)) {
				alpha.append(ch);
			} else if (Character.isDigit(ch)) {
				numeric.append(ch);
			}
		}

		System.out.println("Alphabet : " + alpha);
		System.out.println("Numeric : " + numeric);
	}
}
