package java_core.coding_problems.arrays.find_duplicates;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicates2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the " + i + "th element : ");
			arr[i] = scanner.nextInt();
		}

		System.out.println("Array is : ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		Set<Integer> uniqueElements = new HashSet<Integer>();
		Set<Integer> duplicateElements = new HashSet<Integer>();

		for (int value : arr) {
			if (!uniqueElements.add(value)) {
				duplicateElements.add(value);
			}
		}

		if (duplicateElements.isEmpty()) {
			System.out.println("No duplicate elements.");
		} else {
			System.out.println("Duplicate elements : " + duplicateElements);
		}
	}
}
