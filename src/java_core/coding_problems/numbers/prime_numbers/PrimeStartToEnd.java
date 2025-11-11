package java_core.coding_problems.numbers.prime_numbers;

import java.util.Scanner;

public class PrimeStartToEnd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start number : ");
		int start = scanner.nextInt();
		System.out.println("Enter the end number : ");
		int end = scanner.nextInt();

		System.out.println("Prime numbers between " + start + " and " + end + " are : ");
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
