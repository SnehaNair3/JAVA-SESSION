package java_core.coding_problems.numbers.largest_of_three;

import java.util.Scanner;

public class LargestThree1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		int num1 = scanner.nextInt();

		System.out.println("Enter the second number : ");
		int num2 = scanner.nextInt();

		System.out.println("Enter the third number : ");
		int num3 = scanner.nextInt();

		int largest = 0;

		if (num1 >= num2 && num1 >= num3) {
			largest = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			largest = num2;
		} else {
			largest = num3;
		}

		System.out.println("Largest of three numbers : " + largest);

	}
}
