package problems.string;

import java.util.Scanner;

public class StringAnagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string : ");
		String str2 = sc.nextLine();
		System.out.println(areAnagrams(str1, str2));
	}

	public static boolean areAnagrams(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		int[] charCount = new int[256];
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
