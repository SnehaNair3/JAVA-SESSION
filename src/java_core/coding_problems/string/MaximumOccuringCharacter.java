package java_core.coding_problems.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumOccuringCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scanner.nextLine();
		System.out.println("String is : " + str);
		FindMaxOccuringChar(str);
	}

	public static void FindMaxOccuringChar(String input) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		for (Character ch : input.toCharArray()) {
			if(ch == ' ') {
				continue;
			}
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}

		char maxOccuringChar = ' ';
		int maxFrequency = 0;

		for (Map.Entry<Character, Integer> e : charCountMap.entrySet()) {
			if (e.getValue() > maxFrequency) {
				maxOccuringChar = e.getKey();
				maxFrequency = e.getValue();
			}
		}

		System.out.println("Maximum occurring character is : " + maxOccuringChar + "  with frequency : " + maxFrequency);

	}
}
