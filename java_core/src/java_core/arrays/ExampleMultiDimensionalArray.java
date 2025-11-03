package java_core.arrays;

import java.util.Scanner;

public class ExampleMultiDimensionalArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of rows : ");
		int rows = sc.nextInt();

		System.out.println("Enter no of columns : ");
		int cols = sc.nextInt();

		int[][] arr = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			System.out.println("Enter the elemnts for row " + (i + 1));
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// displaying
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
