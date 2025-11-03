package java_core.coding_problems.string;

import java.util.Scanner;

public class StringPalindrome2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();

		if (isPalindrome(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}

	public static boolean isPalindrome(String input) {
		int n = input.length();
		for (int i = 0; i < n / 2; i++) {
			if (input.charAt(i) != input.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;

	}
}
