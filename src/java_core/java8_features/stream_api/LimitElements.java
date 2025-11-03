package java_core.java8_features.stream_api;

import java.util.Arrays;
import java.util.List;

public class LimitElements {
	public static void main(String[] args) {
		List<String> vegs = Arrays.asList("Cabbage", "Beetroot", "Pea", "Carrot", "Tomato");

		vegs.stream().limit(4).forEach(System.out::println);
	}
}
