package java_core.exceptions.custom_exceptions.unchecked;

class DivideZero extends RuntimeException {

	public DivideZero(String m) {
		super(m);
	}

}

public class DivideCheck {

	public static void divide(int x, int y) throws DivideZero {
		if (y == 0) {
			throw new DivideZero("Division by zero not possible.");
		} else {
			System.out.println("Result : " + x / y);
		}
	}

	public static void main(String[] args) {
		try {
			divide(10, 0);
		} catch (DivideZero e) {
			System.out.println("Caught error : " + e.getMessage());
		}
	}
}
