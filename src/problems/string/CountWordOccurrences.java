package problems.string;

import java.util.HashMap;
import java.util.Scanner;

public class CountWordOccurrences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = sc.nextLine();
		wordCount(input);
	}

	public static void wordCount(String input) {
		HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
		for (String s : input.split(" ")) {
			if (wordCountMap.containsKey(s)) {
				wordCountMap.put(s, wordCountMap.get(s) + 1);
			} else {
				wordCountMap.put(s, 1);
			}
		}
		System.out.println("Count of words in the given string are : " + wordCountMap);
	}
}
