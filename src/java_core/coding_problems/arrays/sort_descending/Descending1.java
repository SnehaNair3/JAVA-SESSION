package java_core.coding_problems.arrays.sort_descending;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Descending1 {
	public static void main(String[] args) {
		Integer[] numbers = { 3, 7, 2, 15, 10 };

		Arrays.sort(numbers, Collections.reverseOrder());

		System.out.println("Array in descending order : " + Arrays.toString(numbers));
	}
}
