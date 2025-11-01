package java_core.coding_problems.string;

import java.util.HashMap;
import java.util.Scanner;

public class CountWordOccurrences {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scanner.nextLine();
		countWordOccur(str);
	}

	public static void countWordOccur(String inputString) {

		HashMap<String, Integer> strCountMap = new HashMap<String, Integer>();
		for (String s : inputString.split(" ")) {
			if (strCountMap.containsKey(s)) {
				strCountMap.put(s, strCountMap.get(s) + 1);
			} else {
				strCountMap.put(s, 1);
			}
		}

		System.out.println("Word occurrences in the given string : " + strCountMap);
	}
}
