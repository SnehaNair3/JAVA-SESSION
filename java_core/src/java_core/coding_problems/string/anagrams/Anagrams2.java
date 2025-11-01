package java_core.coding_problems.string.anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string : ");
		String str2 = sc.nextLine();

		char[] x = str1.replaceAll("\\s", "").toLowerCase().toCharArray();

		char[] y = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

		Arrays.sort(x);
		Arrays.sort(y);

		System.out.println(Arrays.equals(x, y) ? "Anagrams" : "Not anagrams");

	}
}
