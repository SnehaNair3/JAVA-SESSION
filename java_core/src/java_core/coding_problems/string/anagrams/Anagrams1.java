package java_core.coding_problems.string.anagrams;

import java.util.Scanner;

public class Anagrams1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string : ");
		String str2 = sc.nextLine();

		if (areAnagrams(str1, str2)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not anagrams");
		}
	}

	public static boolean areAnagrams(String str1, String str2) {
		int[] charCount = new int[256];

		if (str1.length() != str2.length()) {
			return false;
		}

		for (int i = 0; i < str1.length(); i++) {
			charCount[str1.charAt(i)]++;
			charCount[str2.charAt(i)]--;
		}

		for (int count : charCount) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}
}
