package java_core.coding_problems.string.only_letters_string;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  the string : ");
		String str = scanner.nextLine();
		System.out.println(" String contains only letters : " + checkOnlyLetters(str));
	}

	public static boolean checkOnlyLetters(String str) {
		return str.chars().allMatch(Character::isLetter);
	}
}
