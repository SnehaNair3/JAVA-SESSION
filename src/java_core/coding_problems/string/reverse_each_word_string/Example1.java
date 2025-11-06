package java_core.coding_problems.string.reverse_each_word_string;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scanner.nextLine();
		System.out.println("Original string is : " + str);
		reverseEachWord(str);
	}

	public static void reverseEachWord(String input) {

		String reversedWordString = "";
		String[] words = input.split(" ");

		for (int i = 0; i < words.length; i++) {
			String result = "";
			String word = words[i];
			char ch;

			for (int j = 0; j < word.length(); j++) {
				ch = word.charAt(j);
				result = ch + result;
			}
			reversedWordString = reversedWordString + result + " ";
		}

		System.out.println("Reversed Word String is : " + reversedWordString);

	}
}
