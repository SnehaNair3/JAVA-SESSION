package java_core.coding_problems.numbers.swap_numbers;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = scanner.nextInt();

		System.out.println("Enter second number : ");
		int num2 = scanner.nextInt();

		System.out.println("Before swapping : ");
		System.out.println("num1 = " + num1 + "  num2 = " + num2);
		System.out.println();

		swap(num1, num2);

	}

	public static void swap(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After swapping : ");
		System.out.println("num1 = " + num1 + "  num2 = " + num2);
	}
}
