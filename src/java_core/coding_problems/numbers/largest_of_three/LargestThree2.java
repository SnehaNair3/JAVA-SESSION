package java_core.coding_problems.numbers.largest_of_three;

import java.util.Scanner;

public class LargestThree2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		int num1 = scanner.nextInt();

		System.out.println("Enter the second number : ");
		int num2 = scanner.nextInt();

		System.out.println("Enter the third number : ");
		int num3 = scanner.nextInt();

		int largest = (num1 >= num2) ? (num1 >= num3 ? num1 : num3) : (num2 >= num3 ? num2 : num3);

		System.out.println("Largest of three numbers is : " + largest);
	}
}
