package java_core.coding_problems.numbers.matrices;

public class MatrixAddition {
	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] matrix2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int rows = matrix1.length;
		int columns = matrix1[0].length;

		if (rows != matrix2.length && columns != matrix2[0].length) {
			System.out.println("Matrix addition not possible.");
		} else {
			int[][] sum = new int[rows][columns];

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					sum[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}

			// display matrix1
			System.out.println("Matrix1 is : ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(matrix1[i][j] + " ");
				}
				System.out.println();
			}

			// display matrix2
			System.out.println("Matrix2 is : ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(matrix2[i][j] + " ");
				}
				System.out.println();
			}

			// display sum matrix
			System.out.println("Sum matrix is : ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(sum[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
