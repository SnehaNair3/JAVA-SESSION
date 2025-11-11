package java_core.coding_problems.numbers.prime_numbers;

import java.util.Scanner;

public class FindPrime1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total term : ");
		int num = scanner.nextInt();

		System.out.println("Prime numbers are : ");
		for (int i = 0; i <= num; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}

		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
