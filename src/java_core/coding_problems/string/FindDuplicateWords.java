package java_core.coding_problems.string;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		findDuplicateWords(str);
	}

	public static void findDuplicateWords(String str) {
		HashMap<String, Integer> stringCountMap = new HashMap<String, Integer>();

		for (String s : str.split(" ")) {
			if (stringCountMap.containsKey(s)) {
				stringCountMap.put(s, stringCountMap.get(s) + 1);
			} else {
				stringCountMap.put(s, 1);
			}
		}

		Set<String> keys = stringCountMap.keySet();
		System.out.println("Duplicate words are : ");
		for (String key : keys) {
			if (stringCountMap.get(key) > 1) {
				System.out.println(key + " ");
			}
		}
	}
}
