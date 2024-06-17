package assign5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class ArticlesStream {
	
	public static List<Articles> setArticles() {
		
		List<Articles> artlst = new ArrayList<>();
		artlst.add(new Articles("aaa",2018,"AI", 5124));
		artlst.add(new Articles("bbb",2023,"IT", 6451));
		artlst.add(new Articles("ppp",2023,"AI", 928));
		return artlst;
		
	}
	
	
	public static void main (String[] args)
	{
		List<Articles> artlst = setArticles();
		Stream<Articles> astream = artlst.stream();
		astream.forEach(System.out::println);
		
		
		//Q1
		System.out.println("\n--------Articles Created in 2023--------");
		astream = artlst.stream();
		Predicate<Articles> yearfilter = (art)->art.getYear()==2023;
		astream.filter(yearfilter).forEach(System.out::println);
		
		
		//Q2
		System.out.println("\n---------Articles with Subject AI--------");
		astream = artlst.stream();
		Predicate<Articles> subfilter = (art)->art.getSubject()=="AI";
		astream.filter(subfilter).forEach(System.out::println);
		
		
		//Q3
		System.out.println("\n---------Articles Sorted by subjects--------");
		astream = artlst.stream();
		astream.sorted().forEach(System.out::println);
		
		
		//Q4
		System.out.println("\n---------GROUPING OF Articles BY Subject--------");
		astream = artlst.stream();
		Map<String, List<Articles>> groupSubject = astream.collect(Collectors.groupingBy(Articles::getSubject));
		System.out.println(groupSubject);
	
		
		System.out.println("\n--------Counting OF Articles BY Subject--------");
		astream = artlst.stream();
		Map<String, Long> countArt = astream.collect(Collectors.groupingByConcurrent(Articles::getSubject, Collectors.counting()));
		System.out.println(countArt);
		
		
		//Q5
		System.out.println("\n--------Counting OF Articles with views>1K--------");
		astream = artlst.stream();
		long num = astream.filter((n)->n.getViews()>1000).count();
		System.out.println(num);
		
		
		//Q6
		System.out.println("\n---------GROUPING OF Articles BY Year--------");
		astream = artlst.stream();
		Map<Integer, List<Articles>> groupYear = astream.collect(Collectors.groupingBy(Articles::getYear));
		System.out.println(groupYear);
	
		System.out.println("\n--------Counting OF Articles BY Year--------");
		astream = artlst.stream();
		Map<Integer, Long> countYear = astream.collect(Collectors.groupingByConcurrent(Articles::getYear, Collectors.counting()));
		System.out.println(countYear);
	}
}
