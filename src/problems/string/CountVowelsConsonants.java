package problems.string;

import java.util.Scanner;

public class CountVowelsConsonants {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = scanner.nextLine();
		vowelConsonants(str);
	}

	public static void vowelConsonants(String str) {
		int vowels = 0;
		int consonants = 0;
		for (char ch : str.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
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
