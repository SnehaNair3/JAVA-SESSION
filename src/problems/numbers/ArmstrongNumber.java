package problems.numbers;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arm = 0, r, a;
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		a = num;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			arm = arm + r * r * r;
		}

		if (arm == a) {
			System.out.println("Armstrong number.");
		} else {
			System.out.println("Not an armstrong number.");
		}
	}
}
