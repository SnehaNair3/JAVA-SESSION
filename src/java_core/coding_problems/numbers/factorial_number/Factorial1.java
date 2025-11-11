package java_core.coding_problems.numbers.factorial_number;

import java.util.Scanner;

public class Factorial1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scanner.nextInt();

		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}

		System.out.println("Factorial of " + num + " is : " + factorial);
	}
}
