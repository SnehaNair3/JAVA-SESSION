package java_core.coding_problems.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array : ");
		int arrSize = scanner.nextInt();
		int[] arr = new int[arrSize];

		System.out.println("Enter the elements : ");
		for (int i = 0; i < arrSize; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Original array is : " + Arrays.toString(arr));

		String reversedArr = reverseArray(arr);
		System.out.println("Reversed array is : " + reversedArr);
	}

	public static String reverseArray(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}

		return Arrays.toString(arr);

//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
	}
}
