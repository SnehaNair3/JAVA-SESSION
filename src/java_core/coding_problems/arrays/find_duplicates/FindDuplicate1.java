package java_core.coding_problems.arrays.find_duplicates;

import java.util.Scanner;

public class FindDuplicate1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enyet the number of elements of array : ");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the  " + i + "th element of array : ");
			arr[i] = scanner.nextInt();
		}

		System.out.println("Array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		boolean hasDuplicates = false;

		System.out.println("Duplicate elements are : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					hasDuplicates = true;
					break;
				}
			}
		}

		if (!hasDuplicates) {
			System.out.println("No duplicates found.");
		} else {
			System.out.println();
		}
	}
}
