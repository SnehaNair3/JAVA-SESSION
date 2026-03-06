package java_core.enum_examples;

import java.util.Scanner;

public class EnumInSwitch2 {

	enum Days {
		MONDAY, FRIDAY, SUNDAY;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day : ");
		String input = sc.next().toUpperCase();

		Days selectedDay = null;

		// checking if input matches any enum constant
		for (Days d : Days.values()) {
			if (d.name().equals(input)) {
				selectedDay = d;
				break;
			}
		}

		if (selectedDay == null) {
			System.out.println("Invalid day entered.");
			return;
		}

		switch (selectedDay) {
		case MONDAY:
			System.out.println("Monday !!");
			break;

		case FRIDAY:
			System.out.println("Friday !!");
			break;

		case SUNDAY:
			System.out.println("Sunday !!");
			break;
		}

		sc.close();
	}
}
