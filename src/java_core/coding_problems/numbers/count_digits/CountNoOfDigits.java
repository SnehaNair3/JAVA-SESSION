package java_core.coding_problems.numbers.count_digits;

import java.util.Scanner;

public class CountNoOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();

		int digits = countDigits(num);
		System.out.println("Number of digits in " + num + " : " + digits);
	}

	public static int countDigits(int number) {
		int count = 0;
		while (number > 0) {
			int digit = number % 10;
			number /= 10;
			count++;
		}

		return count;
	}
}
