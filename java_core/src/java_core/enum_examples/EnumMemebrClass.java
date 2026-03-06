package java_core.enum_examples;

enum Day1 {
	SUNDAY, MONDAY, TUESDAY, FRIDAY;
}

public class EnumMemebrClass {

	Day1 day;

	public EnumMemebrClass(Day1 day) {
		this.day = day;
	}

	public void tellDay() {
		switch (day) {
		case SUNDAY:
			System.out.println("Sunday");
			break;

		case MONDAY:
			System.out.println("Monday");
			break;

		case TUESDAY:
			System.out.println("Tuesday");
			break;

		case FRIDAY:
			System.out.println("Friday");
			break;

		default:
			System.out.println("Invalid day!");
			break;
		}
	}

	public static void main(String[] args) {
		EnumMemebrClass firstDay = new EnumMemebrClass(Day1.SUNDAY);
		firstDay.tellDay();

		EnumMemebrClass secondDay = new EnumMemebrClass(Day1.MONDAY);
		secondDay.tellDay();

		EnumMemebrClass thirdDay = new EnumMemebrClass(Day1.TUESDAY);
		thirdDay.tellDay();

		EnumMemebrClass fourthDay = new EnumMemebrClass(Day1.FRIDAY);
		fourthDay.tellDay();
	}
}
