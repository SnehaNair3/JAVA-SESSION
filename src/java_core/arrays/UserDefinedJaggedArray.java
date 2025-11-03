package java_core.arrays;

import java.util.Scanner;

public class UserDefinedJaggedArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in the array : ");
		int arraySize = sc.nextInt();

		int arr[][] = new int[arraySize][];

		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter the number of sub elements for row " + (i+1) + " : ");
			int subArrSize = sc.nextInt();
			arr[i] = new int[subArrSize];
		}

		// initializing
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the elements of " + (i+1));
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// printing values
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
