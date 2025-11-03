package java_core.coding_problems.string;

import java.util.Scanner;

public class EvenIndexedCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();

		printEvenIndexCharacters(str);
	}

	public static void printEvenIndexCharacters(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				System.out.println(str.charAt(i));
			}
		}
	}
}
