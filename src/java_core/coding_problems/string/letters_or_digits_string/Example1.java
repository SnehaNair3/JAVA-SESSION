package java_core.coding_problems.string.letters_or_digits_string;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  the string : ");
		String str = scanner.nextLine();
		System.out.println(" String contains only letters or digits  : " + checkLettersOrDigits(str));
	}

	public static boolean checkLettersOrDigits(String str) {
		return str.chars().allMatch(Character::isLetterOrDigit);
	}
}
