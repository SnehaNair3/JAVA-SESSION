package java_core.coding_problems.arrays.array_equality;

import java.util.Arrays;

public class Equality3 {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 1, 2, 3, 4, 6 };
		int[] array3 = { 1, 2, 3, 4, 5 };

		System.out.println("Arr1 and arr2 equal ? " + Arrays.mismatch(array1, array2));
		System.out.println("Arr1 and arr3 equal ? " + Arrays.mismatch(array1, array3));
		System.out.println("Arr2 and arr3 equal ? " + Arrays.mismatch(array2, array3));
	}
}
