package java_core.java8_features.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupElements {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Rahul", "Amit", "Vaibhav", "Meena", "Arya", "Vishnu", "Ram");

		Map<Character, List<String>> grouped = students.stream()
				.collect(Collectors.groupingBy(student -> student.charAt(0)));
		System.out.println(grouped);
	}
}
