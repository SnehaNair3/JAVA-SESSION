package java_core.coding_problems.numbers.perfect_square_number;

import java.util.Scanner;

public class CheckPerfectSquare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();

		int sqrt = (int) Math.sqrt(num);

		if (sqrt * sqrt == num) {
			System.out.println(num + " is a perfect square and sqrt is : "+sqrt);
		} else {
			System.out.println(num + " is not a perfect square.");
		}
	}
}
