package java_core.java8_features.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample1 {
	public static void main(String[] args) {
		List<String> n = Arrays.asList("Geeks", "Government", "ground", "Garage", "apple");

		Predicate<String> p = (s) -> s.startsWith("G");

		for (String st : n) {
			if (p.test(st)) {
				System.out.println(st);
			}
		}
	}
}
