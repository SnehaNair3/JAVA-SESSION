package java_core.coding_problems.arrays.array_equality;

import java.util.Arrays;

public class MultiDimensionalArrayCheck {
	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		int[][] arr2 = { { 0, 9, 8 }, { 6, 7 } };

		int[][] arr3 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		System.out.println("Arr1 and Arr2 equal ? " + Arrays.deepEquals(arr1, arr2));
		System.out.println("Arr1 and Arr3 equal ? " + Arrays.deepEquals(arr1, arr3));

	}
}
