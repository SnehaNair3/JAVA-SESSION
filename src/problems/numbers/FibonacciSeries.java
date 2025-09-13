package problems.numbers;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms : ");
		int terms = sc.nextInt();

		int first = 0, second = 1, next;
		System.out.println("Fibonacci Series : ");
		for (int i = 0; i < terms; i++) {
			System.out.print(first + " ");
			next = first + second;
			first = second;
			second = next;
		}
	}
}
