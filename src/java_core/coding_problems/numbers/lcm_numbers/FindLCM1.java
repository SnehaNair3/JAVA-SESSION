package java_core.coding_problems.numbers.lcm_numbers;

import java.util.Scanner;

public class FindLCM1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first  number : ");
		int num1 = scanner.nextInt();

		System.out.println("Enter the second  number : ");
		int num2 = scanner.nextInt();

		int lcm = findlcm(num1, num2);
		System.out.println("LCM of " + num1 + " and " + num2 + " is : " + lcm);
	}

	public static int findlcm(int num1, int num2) {
		return (num1 * num2) / gcd(num1, num2);
	}

	public static int gcd(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		}

		return gcd(num2, num1 % num2);
	}
}
