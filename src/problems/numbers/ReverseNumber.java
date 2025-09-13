package problems.numbers;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, rev = 0, r;
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		a = num;
		while (num > 0) {
			r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;

		}

		System.out.println("Reverse is : " + rev);
	}
}
