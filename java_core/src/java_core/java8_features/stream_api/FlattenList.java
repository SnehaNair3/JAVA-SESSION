package java_core.java8_features.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {
	public static void main(String[] args) {
		List<List<String>> vehicles = Arrays.asList(Arrays.asList("Bus", "Train"), Arrays.asList("Car", "Bike"));

		vehicles.stream().flatMap(List::stream).forEach(System.out::println);

		List<String> flatted = vehicles.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(flatted);
	}
}
