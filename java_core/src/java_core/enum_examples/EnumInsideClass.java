package java_core.enum_examples;

public class EnumInsideClass {
	enum Color {
		BLUE, GREEN, RED, PURPLE, PINK;
	}

	public static void main(String[] args) {
		Color c1 = Color.BLUE;
		System.out.println(c1);

		Color c2 = Color.PURPLE;
		System.out.println(c2);
	}
}
