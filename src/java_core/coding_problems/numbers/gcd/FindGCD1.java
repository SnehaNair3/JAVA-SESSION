package java_core.coding_problems.numbers.gcd;

import java.util.Scanner;

public class FindGCD1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = scanner.nextInt();

		System.out.println("Enter the second number : ");
		int num2 = scanner.nextInt();

		int gcd = findgcd(num1, num2);

		System.out.println("GCD of " + num1 + " and " + num2 + " is : " + gcd);
	}

	public static int findgcd(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		} else {
			return findgcd(num2, num1 % num2);
		}
	}
}
