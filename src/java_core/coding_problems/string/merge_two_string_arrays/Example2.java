package java_core.coding_problems.string.merge_two_string_arrays;

public class Example2 {
	public static void main(String[] args) {
		String[] arr1 = { "java", "is", "fun" };
		String[] arr2 = { "and", "powerful" };

		String[] mergedArr = new String[arr1.length + arr2.length];

		System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
		System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);

		for (String element : mergedArr) {
			System.out.print(element + " ");
		}

	}
}
