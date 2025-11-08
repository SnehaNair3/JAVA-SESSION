package java_core.coding_problems.arrays.array_equality;

public class Equality2 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 9, 8, 7, 6, 5 };
		int[] arr3 = { 1, 2, 3, 4, 5 };

		System.out.println("Arr1 and arr2 equal ? " + arrayEqual(arr1, arr2));
		System.out.println("Arr1 and arr3 equal ? " + arrayEqual(arr1, arr3));
	}

	public static boolean arrayEqual(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
}
