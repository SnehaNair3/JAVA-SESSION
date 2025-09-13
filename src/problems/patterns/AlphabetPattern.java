package problems.patterns;

public class AlphabetPattern {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (char c = 'A'; c < 'A'+i; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
