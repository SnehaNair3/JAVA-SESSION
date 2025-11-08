package java_core.coding_problems.arrays;

import java.util.Scanner;

public class LargestElementInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println(" Enter the " + i + "th element : ");
			arr[i] = scanner.nextInt();
		}

		System.out.println("Array is : ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		int largest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}

		}
		System.out.println("Largest element is : " + largest);
	}
}
