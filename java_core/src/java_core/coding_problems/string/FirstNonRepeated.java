package java_core.coding_problems.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeated {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		Character result = firstNonRepeated(str);
		System.out.println("First non-repeated character is : " + result);
	}

	public static Character firstNonRepeated(String input) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		for (char ch : input.toCharArray()) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return '\0';
	}
}
