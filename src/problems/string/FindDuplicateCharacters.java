package problems.string;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an input string : ");
		String input = sc.nextLine();
		duplicateCharacter(input);
	}

	public static void duplicateCharacter(String input) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] charArray = input.toCharArray();
		for (char ch : charArray) {
			if (ch == ' ') {
				continue;
			}
			if (charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}

		Set<Character> charsInString = charCountMap.keySet();
		System.out.println("Duplicate characters in String " + input + " are : ");
		for (Character ch : charsInString) {
			if (charCountMap.get(ch) > 1) {
				System.out.println(ch + " : " + charCountMap.get(ch));
			}
		}
	}
}
