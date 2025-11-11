package java_core.coding_problems.numbers.factorial_number;

import java.util.Scanner;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scanner.nextInt();

		if (num >= 0) {
			long factorial = factorial(num);
			System.out.println("Factorial is : " + factorial);
		} else {
			System.out.println("Factorial is not defined for negative numbers.");
		}
	}

	public static long factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
