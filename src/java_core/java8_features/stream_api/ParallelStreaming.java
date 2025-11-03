package java_core.java8_features.stream_api;

import java.util.Arrays;
import java.util.List;

public class ParallelStreaming {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Charlie", "Bob", "David", "Jacob");

		names.stream().parallel().forEach(name -> System.out.println(name + " " + Thread.currentThread().getName()));
	}
}
