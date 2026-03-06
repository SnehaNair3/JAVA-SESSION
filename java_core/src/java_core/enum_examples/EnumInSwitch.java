package java_core.enum_examples;

import java.util.Scanner;

public class EnumInSwitch {

	enum Day {
		SUNDAY, MONDAY, FRIDAY, SATURDAY;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter a day : ");
			String input = sc.nextLine();

			Day day = Day.valueOf(input.toUpperCase());

			switch (day) {
			case SUNDAY:
				System.out.println("Preparing for the coming week.Reset Mood!");
				break;

			case MONDAY:
				System.out.println("Week days starts! OMG, Iam lazy to go to work!");
				break;

			case FRIDAY:
				System.out.println("Weekend , Iam so happy, Gonna rest for 2 days!");
				break;

			case SATURDAY:
				System.out.println("Favourite day of the week! Enjoying the calmness!");
				break;

			default:
				System.out.println("Weekdays ! ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
