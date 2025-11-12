package java_core.coding_problems.numbers.strong_number;

import java.util.Scanner;

public class StrongNumber1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();

		int sum = 0;
		int originalNum = num;

		while (num > 0) {
			int digit = num % 10;

			int factorial = 1;
			for (int i = 1; i <= digit; i++) {
				factorial *= i;
			}
			sum += factorial;
			num = num / 10;
		}

		if (sum == originalNum) {
			System.out.println(originalNum + " is a strong number.");
		} else {
			System.out.println(originalNum + " is not a strong number.");
		}
	}
}
