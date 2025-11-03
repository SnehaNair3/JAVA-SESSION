package java_core.coding_problems.string;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();

		if (isPalindrome(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	public static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
