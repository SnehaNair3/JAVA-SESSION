package java_core.java8_features.lambda_expressions.example1;

public class DrawableMain {
	public static void main(String[] args) {
		int radius = 10;

		Drawable drawable = () -> System.out.println("Drawing a circle with radius : " + radius);
		drawable.draw();

	}
}
