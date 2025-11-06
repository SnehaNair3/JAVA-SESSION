package java_core.coding_problems.string;

import java.util.Scanner;

public class CheckNullOrEmptyString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str1 = sc.nextLine();

		if (str1 == null) {
			System.out.println("string is null.");
		} else if (str1.isEmpty()) {
			System.out.println("string is empty.");
		} else {
			System.out.println("string is neither null nor empty.");
		}
	}
}
