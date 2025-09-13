package problems.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
	public static void main(String[] args) {
		Integer[] arr = { 20, 35, 46, 67, 45, 3 };

		Arrays.sort(arr);
		System.out.println("Ascending order : " + Arrays.toString(arr));

		Arrays.sort(arr, java.util.Collections.reverseOrder());
		System.out.println("Descending order : " + Arrays.toString(arr));
	}
}
