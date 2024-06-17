package assign4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Colours {

	public static void main(String[] args) {
		String[] colours = {"Red","Orange","Yellow","green","Blue","indigo","Violet"};
		
		
		//Q1
		Stream<String> istream = Arrays.stream(colours);
		List<String> upColours = istream.map((str)->(str.toUpperCase())).collect(Collectors.toList());
		System.out.println(upColours);
		 
		istream = Arrays.stream(colours);
		List<String> lowColours = istream.map((str)->(str.toLowerCase())).collect(Collectors.toList());
		System.out.println(lowColours);
		
		//Q2
		istream = Arrays.stream(colours);
		List<String> sorted = istream.sorted().filter(n->n.compareToIgnoreCase("m")<0).collect(Collectors.toList());
		System.out.println(sorted);
		
		
		istream = Arrays.stream(colours);
		List<String> rsorted = istream.filter(n->n.compareToIgnoreCase("m")<0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(rsorted);
		
		istream = Arrays.stream(colours);
		List<String> lessCharString = istream.filter(n->n.length()<=5).collect(Collectors.toList());
		System.out.println(lessCharString);		 
	}

}
