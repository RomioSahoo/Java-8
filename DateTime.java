package assignments;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime {

	public static void main(String[] args) {
		// yyyy-mm-dd
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current date: " + currentDate);

		// custom date
		LocalDate customDate = LocalDate.of(2020, Month.JULY, 22);
		System.out.println("Custom date:" + customDate);

		LocalDate dayOfYear1 = LocalDate.ofYearDay(2020, 155);
		System.out.println("155th day of year 2020:" + dayOfYear1);

		// LocalDate dayOfYear2=LocalDate.ofInstant(instant, zone)

		// Current time
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current time: " + currentTime);

		// Custom time
		LocalTime customTime = LocalTime.of(22, 45, 12);
		System.out.println("Custom time: " + customTime);

		LocalTime timeAtSeconds = LocalTime.ofSecondOfDay(1201);
		System.out.println("Time at 1201 seconds:" + timeAtSeconds);

		// combination of date and time
		LocalDateTime dateTimeToday = LocalDateTime.now();
		System.out.println("Today's date and time:" + dateTimeToday);

		// custom dateTime
		LocalDateTime customDateTime = LocalDateTime.of(LocalDate.of(2020, Month.OCTOBER, 9), LocalTime.of(21, 11, 25));
		System.out.println("custom date and time: " + customDateTime);

		// alternative of LocalDateTime
		Instant time = Instant.now();
		System.out.println("Instant time:" + time);

		// difference
		LocalDate d1 = LocalDate.of(1998, Month.MARCH, 15);
		LocalDate d2 = LocalDate.now();
		Period diff = Period.between(d2, d1);
		System.out.println("Diference in time using period:" + diff);

		// for DateTime diff
		LocalDateTime dt1 = LocalDateTime.of(d1, currentTime);
		LocalDateTime dt2 = LocalDateTime.now();
		long days = Duration.between(dt1, dt2).toDays();
		System.out.println("Age in days:" + days);

		long minutes = Duration.between(dt1, dt2).toMinutes();
		System.out.println("Age in minutes:" + minutes);

		long seconds = Duration.between(dt1, dt2).toSeconds();
		System.out.println("Age in seconds:" + seconds);

		// Offset date time
		OffsetDateTime off = OffsetDateTime.now();
		System.out.println("Offset date and time:" + off);

		// Zoned date and time
		ZoneId india = ZoneId.of("Asia/Kolkata");
		ZonedDateTime zone = ZonedDateTime.of(dt1, india);
		System.out.println("Zoned date and time:" + zone);

		ZonedDateTime z = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris"));
		System.out.println(z);

	}

}
