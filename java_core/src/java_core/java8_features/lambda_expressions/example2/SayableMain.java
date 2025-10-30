package java_core.java8_features.lambda_expressions.example2;

public class SayableMain {
	public static void main(String[] args) {

		// without lambda
		Sayable sayable = new Sayable() {

			@Override
			public void say() {
				System.out.println("Saying without lambda expression");

			}
		};
		sayable.say();

		// with lambda
		Sayable sayable2 = () -> System.out.println("Saying with lambda");
		sayable2.say();
	}
}
