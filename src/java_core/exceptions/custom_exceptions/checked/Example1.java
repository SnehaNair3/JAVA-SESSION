package java_core.exceptions.custom_exceptions.checked;

class AgeException extends Exception {

	public AgeException(String msg) {
		super(msg);
	}

}

public class Example1 {

	public static void ageCheck(int age) throws AgeException {

		if (age < 18) {
			throw new AgeException("Age must be above 18.");
		} else {
			System.out.println("You are eligible to vote.");
		}

	}

	public static void main(String[] args) {
		try {
			ageCheck(15);
		} catch (AgeException e) {
			System.out.println("Caught exception : " + e.getMessage());
		}
	}
}
