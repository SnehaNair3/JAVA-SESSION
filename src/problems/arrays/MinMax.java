package problems.arrays;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of elements in array: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the elements of array : ");
		for (int i = 0; i < arr.length; i++) {
			int num = scanner.nextInt();
			arr[i] = num;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int min = arr[0], max = arr[0];

		for (int v : arr) {
			if (v < min) {
				min = v;
			}

			if (v > max) {
				max = v;
			}
		}

		System.out.println("Largest element : " + max);
		System.out.println("Smallest element is : " + min);
	}
}
