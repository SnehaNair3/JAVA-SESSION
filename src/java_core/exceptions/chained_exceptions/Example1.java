package java_core.exceptions.chained_exceptions;

public class Example1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int divisor = 0;

		try {
			for (int i = 0; i < arr.length; i++) {
				int res = arr[i] / divisor;
				System.out.println("Result : " + res);
			}
		} catch (ArithmeticException e) {
			throw new RuntimeException("Caught error : " + e.getMessage());
		}
	}
}
