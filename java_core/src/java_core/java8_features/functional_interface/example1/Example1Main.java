package java_core.java8_features.functional_interface.example1;

public class Example1Main {
	public static void main(String[] args) {
		Exercise exercise = (name) -> System.out.println(name + "  is running");
		exercise.run("Maya");
	}
}
