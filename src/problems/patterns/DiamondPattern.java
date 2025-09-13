package problems.patterns;

public class DiamondPattern {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			for (int p = 1; p <= n - i; p++) {
				System.out.print(" ");
			}

			for (int q = 1; q <= 2 * i - 1; q++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
