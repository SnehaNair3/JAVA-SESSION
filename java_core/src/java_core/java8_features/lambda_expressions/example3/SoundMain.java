package java_core.java8_features.lambda_expressions.example3;

public class SoundMain {
	public static void main(String[] args) {

		Sound sound = (name) -> System.out.println(name + " is crying.");
		sound.cry("Ram");
	}
}
