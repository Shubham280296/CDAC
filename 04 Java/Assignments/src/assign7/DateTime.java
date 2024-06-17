package assign7;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DateTime {
	public static void main(String[] args)
	{
		
		//Q1
		LocalDate today = LocalDate.now();
		LocalDate bday = LocalDate.of(1996,02,28);
		Period age = bday.until(today);
		System.out.println("Age : "+age.getYears()+"years "+age.getMonths()+"months "+age.getDays()+"Days");
		
		
		//Q2
		System.out.println("Programmers day : "+(today.withDayOfYear(256).getDayOfWeek()));
		
		
		//Q3
		Stream<LocalDate> year2024 = LocalDate.of(2024,1, 1).datesUntil(LocalDate.of(2025, 1, 1));
		Predicate<LocalDate> sundayOn1st = (date)->((((LocalDate) date).getDayOfWeek().equals(DayOfWeek.SUNDAY))&&(((LocalDate) date).getDayOfMonth()==1));
		System.out.println("Months with Sunday on 1st (2024)");
		List<LocalDate>months= year2024.filter(sundayOn1st).collect(Collectors.toList());
		for (LocalDate month  : months)
		{
			System.out.println(month.getMonth());
		}
		
		
		//Q4		
		ZonedDateTime sdt1 = LocalDateTime.of(2024,04,05,2,05,0).atZone(ZoneId.of("Asia/Kolkata"));
		ZonedDateTime sdt2 = LocalDateTime.of(2024,04,05,16,40,0).atZone(ZoneId.of("America/New_York"));
		System.out.println("Flight time : "+Duration.between(sdt1,sdt2));
		
	}

}
