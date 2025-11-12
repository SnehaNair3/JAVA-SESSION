package java_core.coding_problems.numbers.palindrome_number;

import java.util.Scanner;

public class CheckPalindrome1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();

		if (isPalindrome(number)) {
			System.out.println(number + " is palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}
		
		scanner.close();
	}

	public static boolean isPalindrome(int num) {
		int temp = num;
		int reversedNum = 0;

		while(temp >0) {
			int digit = temp % 10;
			reversedNum = reversedNum * 10 + digit;
			temp /= 10;
		}

		if (reversedNum == num) {
			return true;
		}

		return false;
	}
	
	
}
