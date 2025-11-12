package java_core.coding_problems.string;

import java.util.Scanner;

public class RemoveWhiteSpaces2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  string : ");
		String str = sc.nextLine();

		String strWithoutSpaces = str.replaceAll("\\s+", "");
		System.out.println("String without spaces : " + strWithoutSpaces);
	}
}
