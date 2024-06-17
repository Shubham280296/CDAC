package day10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseFormat {
	public static void main(String[] args)
	{
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		String mydate = dt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy+ HH:mm:ss"));
		System.out.println(mydate);
		
		LocalDateTime date = LocalDateTime.parse(mydate,DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		System.out.println(date);
		
		
	}
	
}
