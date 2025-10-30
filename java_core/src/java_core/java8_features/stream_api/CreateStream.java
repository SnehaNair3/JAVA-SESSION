package java_core.java8_features.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Manya", "Adhya", "Radhu", "Pinky", "Sreerag");

		Stream<String> nameStream = names.stream();

		nameStream.forEach(System.out::println);
	}
}
