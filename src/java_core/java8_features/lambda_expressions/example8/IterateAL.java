package java_core.java8_features.lambda_expressions.example8;

import java.util.Arrays;
import java.util.List;

public class IterateAL {
	public static void main(String[] args) {
		List<String> subjects = Arrays.asList("Java", "Python", "DSA", "CN", "COA", "Cybersecurity");

		// stream with lambda expression
		System.out.println("JDK 8 streaming example lambda expression");
		subjects.stream().forEach(subject -> printSub(subject));

		System.out.println("JDK 8 streaming example method reference");
		subjects.stream().forEach(IterateAL::printSub);

		System.out.println("JDK 8 for each with lambda");
		subjects.forEach(subject -> printSub(subject));

		System.out.println("JDK 8 for each");
		subjects.forEach(IterateAL::printSub);
	}

	public static void printSub(String sub) {
		System.out.println("Subject : " + sub);
	}
}
