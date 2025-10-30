package java_core.java8_features.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Ram", "Sneha", "Arya", "Neha", "Sam", "Bob", "Amit");

		 // Filter names that start with 'A'
		List<String> namesStartingA = students.stream().filter(student -> student.startsWith("A"))
				.collect(Collectors.toList());
		System.out.println(namesStartingA);
	}
}
