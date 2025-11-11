package java_core.coding_problems.numbers.fibonacci_series;

import java.util.Scanner;

public class Fibonacci1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of terms : ");
		int terms = scanner.nextInt();

		int firstTerm = 0, secondTerm = 1;
		System.out.print(firstTerm + " ");
		for (int i = 0; i < terms; i++) {
			System.out.print(firstTerm + " ");
			int nextTerm = firstTerm + secondTerm;

			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
