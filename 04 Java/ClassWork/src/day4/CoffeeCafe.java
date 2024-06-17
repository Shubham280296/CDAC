package day4;
import java.util.Scanner;

public class CoffeeCafe {

	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
		Scanner obj2 = new Scanner(System.in);
		System.out.println("***************MENU**************");
		Coffee[] coffeeList = Coffee.values();
		
		for (Coffee coffee: coffeeList) {
			System.out.println(coffee);
		}
		System.out.println("Enter a choice: ");
		String coffee = obj1.nextLine();
		Coffee cof = Coffee.valueOf(coffee);
		System.out.println("Enter quantity: ");
		int qty = obj2.nextInt();
		switch (cof) {
		case SMALL:
			System.out.println("Your final payable amount : "+cof.getPrice()*qty);
			break;
		case MEDIUM:
			System.out.println("Your final payable amount : "+cof.getPrice()*qty);
			break;
		case LARGE:
			System.out.println("Your final payable amount : "+cof.getPrice()*qty);
			break;

		}
	}
}
