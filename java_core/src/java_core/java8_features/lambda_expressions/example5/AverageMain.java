package java_core.java8_features.lambda_expressions.example5;

public class AverageMain {
	public static void main(String[] args) {

		Average average = (arr) -> {
			double sum = 0;

			int arrSize = arr.length;

			for (int i = 0; i < arrSize; i++) {
				sum += arr[i];
			}

			double result = sum / arrSize;
			return result;
		};

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(average.avg(arr));
	}
}
