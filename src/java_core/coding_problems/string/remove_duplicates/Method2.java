package java_core.coding_problems.string.remove_duplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Method2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();

		String result = removeDuplicates(str);

		System.out.println("Original string is : " + str);
		System.out.println("String with duplicates removed : " + result);

	}

	public static String removeDuplicates(String str) {

		Set<String> wordSet = Arrays.stream(str.split("\\s+")).collect(Collectors.toCollection(LinkedHashSet::new));

		return String.join(" ", wordSet);

	}

}
