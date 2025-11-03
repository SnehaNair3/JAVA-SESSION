package java_core.java8_features.stream_api;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
	public static void main(String[] args) {
		List<String> devices = Arrays.asList("Laptop", "Phone", "Watch", "Earphone", "Computer");

		boolean anyMatch = devices.stream().anyMatch(device -> device.startsWith("C"));
		System.out.println(anyMatch);

		boolean anyMatch2 = devices.stream().anyMatch(device -> device.startsWith("F"));
		System.out.println(anyMatch2);
	}
}
