package java_core.java8_features.stream_api;

import java.util.Arrays;
import java.util.List;

public class ReduceStream {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		int sum = numbers.stream().reduce(0, (a, b) -> (a + b));
		System.out.println("Sum is : " + sum);
	}
}
