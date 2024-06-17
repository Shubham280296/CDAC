package assign5;
import java.util.Comparator;


public class YearComparator implements Comparator<CarDealer>{

	@Override
	public int compare(CarDealer o1, CarDealer o2) {
		return o1.getYear()-o2.getYear();
	}
	

}
