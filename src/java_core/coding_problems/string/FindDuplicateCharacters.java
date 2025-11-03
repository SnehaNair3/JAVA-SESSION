package java_core.coding_problems.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		findDuplicate(str);
	}

	public static void findDuplicate(String input) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		for (char ch : input.toCharArray()) {
			if (ch == ' ') {
				continue;
			}
			if (charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}

		Set<Character> keys = charCountMap.keySet();
		System.out.println("Duplicate characters are : ");
		for (Character c : keys) {
			if (charCountMap.get(c) > 1) {
				System.out.println(c + " ");
			}
		}

	}

}
