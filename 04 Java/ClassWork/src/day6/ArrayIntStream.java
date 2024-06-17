package day6;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayIntStream {
	
	public static void main(String[] args)
	{
	int [] arr= {1,25,67,12,56,445,52,24,25};
	
	IntStream istream = Arrays.stream(arr);
	 long distictele = istream.distinct().count();
	 System.out.println(distictele);
	 
	 istream = Arrays.stream(arr);
	 long allele = istream.count();
	 System.out.println(allele);
	 
	 istream = Arrays.stream(arr);
	 istream.distinct().sorted().forEach((System.out::println));
	 
	 istream = Arrays.stream(arr);
	 List<Integer> even= istream.distinct().filter((n)->(n%2==0)).boxed().collect(Collectors.toList());
	 System.out.println(even);
	 
	 istream = Arrays.stream(arr);
	 int total = istream.reduce(0,((n1,n2)->(n1+n2)));
	 System.out.println(total);
	 
	 istream = Arrays.stream(arr);
	 OptionalInt min = istream.min();
	 if (min.isPresent())
		 System.out.println(min.getAsInt());
	 
	 
	}

}
