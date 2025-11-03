package java_core.coding_problems.string;

import java.util.Scanner;

public class Sequence1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();

		String result = getCharacterCount(str);
		System.out.println("Result : " + result);
	}

	public static String getCharacterCount(String str) {
		StringBuilder sb = new StringBuilder();
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				sb.append(str.charAt(i)).append(count);
				count = 1;
			}
		}
		return sb.toString();
	}
}
