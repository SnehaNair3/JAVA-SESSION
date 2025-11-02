package java_core.coding_problems;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DemoExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = sc.nextLine();
		System.out.println("Given string : " + str);
		count(str);
	}

	public static void count(String str) {
		int vowels = 0, consonants = 0;

		str.toLowerCase();

		for (char ch : str.toCharArray()) {
			if (ch >= 'A' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}

		System.out.println("Vowels : " + vowels);
		System.out.println("Consonants : " + consonants);
	}

}
