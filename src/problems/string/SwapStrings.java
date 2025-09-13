package problems.string;

import java.util.Scanner;

public class SwapStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String str1 = scanner.nextLine();
		System.out.println("Enter the second string : ");
		String str2 = scanner.nextLine();
		System.out.println("Strings before swapping : ");
		System.out.println("str1 = " + str1 + "  , str2= " + str2);

		str1 = str1 + str2;

		str2 = str1.substring(0, str1.length() - str2.length());

		str1 = str1.substring(str2.length());
		System.out.println("Strings after swapping : ");
		System.out.println("str1 = " + str1 + "  , str2= " + str2);

	}
}
