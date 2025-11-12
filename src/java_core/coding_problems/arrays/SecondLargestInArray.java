package java_core.coding_problems.arrays;

import java.util.Scanner;

public class SecondLargestInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the array elements : ");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Array is : ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		int secondLargest = findSecondLargest(arr);
		System.out.println("Second largest number is : " + secondLargest);

	}

	public static int findSecondLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}

		return secondLargest;
	}
}
