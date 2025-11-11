package java_core.coding_problems.numbers.amstrong_number;

import java.util.Scanner;

public class FindArmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();

		int numberOfDigits = String.valueOf(num).length();

		if (isArmstrong(num, numberOfDigits)) {
			System.out.println(num + " is an Armstrong number.");
		} else {
			System.out.println(num + " is not an Armstrong number.");
		}
	}

	public static boolean isArmstrong(int number, int numberOfDigits) {
		int a = number;
		int sum = 0;

		while (number > 0) {
			int digit = number % 10;
			sum += Math.pow(digit, numberOfDigits);
			number = number / 10;
		}

		if (sum == a) {
			return true;
		}
		return false;
	}
}
