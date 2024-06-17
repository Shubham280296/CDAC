package day10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class DemoLocalDateTime {

	public static void main(String[] args)
	{
	
		LocalTime later = LocalTime.of(12,30);
		
		LocalDateTime dt = later.atDate(LocalDate.now());
		System.out.println(dt);
		
		dt = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(dt);
		
		
		dt = LocalDateTime.of(2024,02,28,18,45,12);
		System.out.println(dt);
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		for(String zone:zones)
		{
			System.out.println(zone);
		}
		
		ZonedDateTime sdt = dt.atZone(ZoneId.of("America/Chicago"));
		System.out.println(sdt);
		
		ZonedDateTime sdt1 = dt.atZone(ZoneId.of("Asia/Kolkata"));
		System.out.println(sdt1);
		ZonedDateTime sdt2 = dt.atZone(ZoneId.of("Universal"));
		System.out.println(sdt2);
		
		System.out.println(sdt.until(sdt1, ChronoUnit.MINUTES));

		
		
	}
}
