package java_core.enum_examples;

enum Month {
	MARCH, APRIL, MAY, JUNE;

	private Month() {
		System.out.println("Constructor called for : " + this);
	}

	public void displayMonth() {
		System.out.println("Month is : " + this);
	}

}

public class EnumConstructor {
	public static void main(String[] args) {
		Month m = Month.APRIL;
		m.displayMonth();
	}
}
