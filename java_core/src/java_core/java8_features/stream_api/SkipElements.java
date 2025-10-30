package java_core.java8_features.stream_api;

import java.util.Arrays;
import java.util.List;

public class SkipElements {
	public static void main(String[] args) {
		List<String> birds = Arrays.asList("Parrot", "Eagle", "Sparrow", "Pigeon", "Duck", "Ostrich");

		birds.stream().skip(3).forEach(System.out::println);
	}
}
