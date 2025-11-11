package java_core.coding_problems.numbers.average_numbers;

import java.util.Scanner;

public class CalculateAverage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter array elements : ");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		double avg = sum / size;
		System.out.println("Average : " + avg);
	}
}
