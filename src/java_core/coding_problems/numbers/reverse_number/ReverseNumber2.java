package java_core.coding_problems.numbers.reverse_number;

import java.util.Scanner;

public class ReverseNumber2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  a number : ");
		int num = scanner.nextInt();

		String reversed = new StringBuilder(String.valueOf(num)).reverse().toString();

		int reversedNumber = Integer.parseInt(reversed);
		System.out.println("Reversed number is : " + reversedNumber);
	}
}
