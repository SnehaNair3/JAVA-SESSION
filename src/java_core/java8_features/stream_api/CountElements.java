package java_core.java8_features.stream_api;

import java.util.Arrays;
import java.util.List;

public class CountElements {
	public static void main(String[] args) {
		List<String> countries = Arrays.asList("India", "USA", "Singapore", "Canada", "China", "Russia");

		long count = countries.stream().count();
		System.out.println("Count : " + count);
	}
}
