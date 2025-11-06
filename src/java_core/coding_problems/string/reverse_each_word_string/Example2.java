package java_core.coding_problems.string.reverse_each_word_string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scanner.nextLine();
		System.out.println("Original string is : " + str);

		String result = reverseEachWord(str);
		System.out.println("Reversed sord string : " + result);

	}

	public static String reverseEachWord(String input) {
		String reversed = Arrays.stream(input.split("\\s+")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		return reversed;
	}
}
