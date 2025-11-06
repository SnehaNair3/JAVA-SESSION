package java_core.coding_problems.string.remove_duplicates;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Method1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();

		String result = removeDuplicates(str);

		System.out.println("Original string is : " + str);
		System.out.println("String with duplicates removed : " + result);
	}

	public static String removeDuplicates(String str) {
		String[] words = str.split(" ");

		Set<String> wordset = new HashSet<String>();
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			if (!wordset.contains(word)) {
				wordset.add(word);
				result.append(word).append(" ");

			}
		}

		return result.toString().trim();
	}
}
