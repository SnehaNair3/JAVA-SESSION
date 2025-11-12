package java_core.coding_problems.numbers.matrices;

public class MatrixTranspose {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int rows = matrix.length;
		int columns = matrix[0].length;

		int[][] transpose = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}

		// print original matrix
		System.out.println("Original matrix is : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Transpose matrix is : ");

		// print transpose matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}
