package assign5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CarDealerStream {

	public static List<CarDealer> setCarDealer() {
		
		List<CarDealer> carlist = new ArrayList<>();
		carlist.add(new CarDealer("Suzuki Baleno","blue",10000.0, 2023));
		carlist.add(new CarDealer("Honda City","silver",29999.0, 2022));
		carlist.add(new CarDealer("Suzuki Baleno","black",5000.0, 2020));
		return carlist;
}

	public static void main(String[] args) {
		
		List<CarDealer> carlist = setCarDealer();
		Stream <CarDealer> estream = carlist.stream();
		estream.forEach(System.out::println);
		
		//Q1
		System.out.println("-------PRINT STOCK FOR CAR MODEL AND COLOUR");
		estream = carlist.stream();
		Predicate<CarDealer> stockModel = (car) -> (car.getModel() == "Suzuki Baleno" && car.getColour() == "black");
		System.out.println(estream.filter(stockModel).count());
		
		//Q2
		System.out.println("\n---------GROUPING OF CARS BY MODEL--------");
		estream = carlist.stream();
		Map<String, List<CarDealer>> groupModel = estream.collect(Collectors.groupingBy(CarDealer::getModel));
		System.out.println(groupModel);
	
		
		//Q3
		System.out.println("\n--------Counting OF CARS BY MODEL--------");
		estream = carlist.stream();
		Map<String, Long> countModel = estream.collect(Collectors.groupingByConcurrent(CarDealer::getModel, Collectors.counting()));
		System.out.println(countModel);
		
		//Q4
		System.out.println("\n--------SORTING OF CARS BY PRICE--------");
		estream = carlist.stream();
		estream.sorted().forEach(System.out::println);
		
		//Q5
		System.out.println("\n--------SORTING OF CARS BY YEAR--------");
		estream = carlist.stream();
		estream.sorted(new YearComparator()).forEach(System.out::println);
	}

}
