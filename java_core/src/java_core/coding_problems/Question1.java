package java_core.coding_problems;

public class Question1 {

	public static int findTopKScorersSum(int[] arr, int k) {
		int N = arr.length;

		for (int i = 0; i < N - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;

				i = -1;
			}
		}

		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += (arr[i]);
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 5 };

		int k = 2;

		System.out.println(findTopKScorersSum(arr, k));
	}
}
