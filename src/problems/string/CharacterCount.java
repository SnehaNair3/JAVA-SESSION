package problems.string;

import java.util.Scanner;

public class CharacterCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input = scanner.nextLine();
		String output = getCharacterCount(input);
		System.out.println(output);
	}

	public static String getCharacterCount(String str) {
		StringBuilder result = new StringBuilder();
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				result.append(str.charAt(i)).append(count);
				count = 1;
			}
		}
		return result.toString();
	}

}
