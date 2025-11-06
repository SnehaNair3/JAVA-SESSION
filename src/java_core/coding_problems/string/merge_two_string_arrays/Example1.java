package java_core.coding_problems.string.merge_two_string_arrays;

public class Example1 {
	public static void main(String[] args) {
		String[] array1 = { "Java", "is", "fun" };

		String[] array2 = { "and", "powerful" };

		String[] mergedArray = new String[array1.length + array2.length];

		int index = 0;

		for (String element : array1) {
			mergedArray[index++] = element;
		}

		for (String element : array2) {
			mergedArray[index++] = element;
		}

		for (String element : mergedArray) {
			System.out.print(element +" ");
		}
	}
}
