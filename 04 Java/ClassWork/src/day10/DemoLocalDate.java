package day10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DemoLocalDate {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		System.out.println(today);
		
		
		LocalDate Christmas = LocalDate.of(2024, 12, 25);
		System.out.println(today.isBefore(Christmas));
		
		long daysleft = today.until(Christmas,ChronoUnit.DAYS);
		System.out.println(daysleft);
		
		LocalDate tommorrow = today.plusDays(1);
		LocalDate nextweek = today.plusWeeks(1);
		System.out.println(tommorrow.getDayOfMonth());
		System.out.println(tommorrow.getDayOfYear());
		System.out.println(tommorrow.getDayOfWeek());
		System.out.println(tommorrow.getYear());
		System.out.println(tommorrow.getMonth());
		System.out.println(tommorrow.getMonthValue());
		
		Stream<LocalDate> year2024 = LocalDate.of(2024,1, 1).datesUntil(LocalDate.of(2025, 1, 1));
		
		Predicate<LocalDate> Friday13 = (date)->((((LocalDate) date).getDayOfWeek().equals(DayOfWeek.FRIDAY))&&(((LocalDate) date).getDayOfMonth()==13));
		year2024.filter(Friday13).forEach(System.out::println);
		
		
	}
	
}
