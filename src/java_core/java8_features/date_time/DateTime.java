package java_core.java8_features.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
	public static void main(String[] args) {

		// current time
		LocalTime time = LocalTime.now();
		System.out.println("Current time : " + time);

		// current date
		LocalDate date = LocalDate.now();
		System.out.println("Current date : " + date);

		// current date and time
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("Current date and time :" + datetime);

		// specific date
		LocalDate specificDate = LocalDate.of(2025, 10, 30);
		System.out.println("Today : " + specificDate);
	}
}
