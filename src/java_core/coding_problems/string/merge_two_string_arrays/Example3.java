package java_core.coding_problems.string.merge_two_string_arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class Example3 {
	public static void main(String[] args) {
		String[] arr1 = { "java", "is", "fun" };
		String[] arr2 = { "and", "powerful" };

		String[] mergedArr = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray(String[]::new);

		for (String element : mergedArr) {
			System.out.print(element + " ");
		}
	}
}
