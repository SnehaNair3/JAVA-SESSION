package java_core.coding_problems.numbers.matrices;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] matrix2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		if (matrix1[0].length != matrix2.length) {
			System.out.println("Matrix multiplication not possible.");
		} else {
			int rows = matrix1.length;
			int columns = matrix2[0].length;

			int[][] result = new int[rows][columns];

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					for (int k = 0; k < matrix2.length; k++) {
						result[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}
			}

			System.out.println("Matrix product is : ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
