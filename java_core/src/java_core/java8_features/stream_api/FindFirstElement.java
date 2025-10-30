package java_core.java8_features.stream_api;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
	public static void main(String[] args) {
		List<String> flowers = Arrays.asList("Rose", "Lilly", "Tulips", "Dahlia");

		String first = flowers.stream().findFirst().orElse("No first");
		System.out.println(first);
	}
}
