package java_core.exceptions;

public class NestedExc {
	public static void main(String[] args) {
		try {
			System.out.println("Outer try block executed.");
			int x = 5;
			int y = 0;
			try {
				int ans = x / y;
				System.out.println("Answer : " + ans);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			String name = null;
			try {
				int length = name.length();
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Exception occurred.");
		}
	}
}
