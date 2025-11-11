package java_core.coding_problems.numbers.reverse_number;

import java.util.Scanner;

public class ReverseNumber1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  a number : ");
		int num = scanner.nextInt();

		int originalNum = num;
		int reversedNum = 0;

		while (num != 0) {
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;
			num = num / 10;
		}

		System.out.println("Original number is :  " + originalNum);
		System.out.println("Reversed number is : " + reversedNum);
	}
}
