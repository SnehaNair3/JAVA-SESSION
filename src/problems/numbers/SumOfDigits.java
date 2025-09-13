package problems.numbers;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		int sum = calculateSum(num);
		System.out.println("Sum of digits : " + sum);

	}

	public static int calculateSum(int num) {
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		return sum;
	}

}
