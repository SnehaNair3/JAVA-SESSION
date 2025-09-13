package problems.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of arrray : ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the elements : ");
		for (int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}

//		for (int v : arr) {
//			System.out.print(v + " ");
//		}
		System.out.println(Arrays.toString(arr));

		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}

		System.out.println();
		System.out.println(Arrays.toString(arr));

	}
}
