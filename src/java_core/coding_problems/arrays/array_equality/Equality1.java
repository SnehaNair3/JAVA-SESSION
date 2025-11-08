package java_core.coding_problems.arrays.array_equality;

import java.util.Arrays;

public class Equality1 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 9, 8, 7, 6, 5 };
		int[] arr3 = { 1, 2, 3, 4, 5 };

		boolean isEqual = Arrays.equals(arr1, arr2);
		boolean areEqual = Arrays.equals(arr1, arr3);

		System.out.println("arr1 and arr2 equal ? " + isEqual);
		System.out.println("arr1 and arr3 equal ? " + areEqual);
	}
}
