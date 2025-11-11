package java_core.coding_problems.numbers.sum_natural_numbers;

import java.util.Scanner;

public class NaturalSum2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = scanner.nextInt();

		int sum = n * (n + 1) / 2;

		System.out.println("Sum is : " + sum);
	}
}
