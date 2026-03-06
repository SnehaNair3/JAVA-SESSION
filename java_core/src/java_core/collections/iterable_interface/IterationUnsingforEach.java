package java_core.collections.iterable_interface;

import java.util.ArrayList;
import java.util.List;

public class IterationUnsingforEach {
	public static void main(String[] args) {
		List<String> cities = new ArrayList<String>();
		cities.add("Bangkok");
		cities.add("Sydney");
		cities.add("Seoul");
		cities.add("Mumbai");

		cities.forEach((city) -> System.out.println(city));

	}
}
