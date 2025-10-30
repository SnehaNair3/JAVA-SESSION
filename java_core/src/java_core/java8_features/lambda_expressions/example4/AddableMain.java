package java_core.java8_features.lambda_expressions.example4;

public interface AddableMain {
	public static void main(String[] args) {
		Addable addable = (a, b) -> (a + b);
		System.out.println(addable.add(10, 20));
		System.out.println("----------------------");

		Addable addable2 = (int a, int b) -> (a + b);
		System.out.println(addable2.add(30, 30));
	}
}
