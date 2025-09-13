package problems.numbers;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		if (isPalindrome(num)) {
			System.out.println(num + " is palindrome.");
		} else {
			System.out.println(num + "  is not palindrome.");
		}
	}

	public static boolean isPalindrome(int num) {
		int originalNum = num;
		int reversedNum = 0;
		while (num > 0) {
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;
			num = num / 10;
		}
		return reversedNum == originalNum;
	}
}
