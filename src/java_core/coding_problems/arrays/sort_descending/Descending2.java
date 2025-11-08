package java_core.coding_problems.arrays.sort_descending;

public class Descending2 {
	public static void main(String[] args) {
		int[] numbers = { 3, 7, 2, 15, 10 };

		for (int i = 0; i < numbers.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] > numbers[index]) {
					index = j;
				}
			}

			int largestNumber = numbers[index];
			numbers[index] = numbers[i];
			numbers[i] = largestNumber;

		}
		System.out.println("Array elements in descending order : ");
		for (int value : numbers) {
			System.out.print(value + " ");
		}
	}
}