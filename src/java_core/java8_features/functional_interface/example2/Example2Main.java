package java_core.java8_features.functional_interface.example2;

import java.util.function.Predicate;

public class Example2Main {
	public static void main(String[] args) {
		Predicate<Person> predicate = (person) -> person.getAge() > 30;

		boolean result1 = predicate.test(new Person("Vidhya", 5));
		System.out.println(result1);
		
		boolean result2 = predicate.test(new Person("Arya", 50));
		System.out.println(result2);
	}
}
