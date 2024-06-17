package day7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoIntegerStream {
	public static void main(String[] args) {
		Integer[] arr = {444,2,3,4,53,2,4,5,6,23};
		Integer[] arr1 = {444,2,3,767,125,45};
		List<Integer> lst = Arrays.asList(arr);
		
		Stream<Integer> istream = lst.stream();
		List<Integer> mapped = istream.distinct().sorted().map((n)-> n*10).collect(Collectors.toList());
		System.out.println(mapped);
		
		istream = lst.stream();
		List<Integer> filtered = istream.filter((n) -> n < 50).collect(Collectors.toList());
		System.out.println(filtered);
		
		istream = lst.stream();
		List<Integer> first10 = istream.limit(10).collect(Collectors.toList());
		System.out.println(first10);
		
		istream = lst.stream();
		int total = istream.reduce(0, (n1, n2)-> n1+n2);
		System.out.println("Total: "+total);
		
		istream = lst.stream();
		Optional<Integer> max = istream.max(Integer::compareTo);
		System.out.println("Maximum value: "+max.get());
		
		istream = lst.stream();
		Optional<Integer> min = istream.min(Integer::compareTo);
		System.out.println("Minimum value: "+min.get());
		
		istream = lst.stream();
		OptionalDouble avg = istream.mapToDouble(Double::valueOf).average();
		System.out.println(avg);
		
		System.out.println(Stream.of(Arrays.asList(arr),Arrays.asList(arr1)).flatMap(List::stream).distinct().collect(Collectors.toList()));
		
		istream = lst.stream();
		System.out.println(istream.sorted().distinct().dropWhile(n->n%2==0).collect(Collectors.toList()));
		
		
		
	}
}
