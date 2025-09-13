package problems.string;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = sc.nextLine();
		char ch;
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			result = ch + result;
		}
		System.out.println("Reversed string is : " + result);
	}
}
