package java_core.coding_problems.numbers.sum_natural_numbers;

import java.util.Scanner;

public class NaturalSum1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = scanner.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("Sum of first " + n + " natural numbers is : " + sum);

	}
}
