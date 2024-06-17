package assign1;

import java.util.Scanner;

public class UserPortal {

	public static void main(String[] args) {

		int i = 0;
		Scanner obj = new Scanner (System.in);
		Scanner obj1 = new Scanner (System.in);
		Scanner obj2 = new Scanner (System.in);
		Scanner obj3 = new Scanner (System.in);
		while(i!=4)
		{
			System.out.println("Choose the dessert option 1.Candies 2.Coockies 3.Ice Cream 4.Exit");
			i = obj.nextInt();
			
			switch (i) {
			case 1:
				System.out.println("Enter flavour");
				String flavour = obj1.nextLine();
				System.out.println("Price per kg");
				float ppk = obj2.nextFloat();
				System.out.println("Quantity in kg");
				int kgs = obj3.nextInt();
				Candies cd = new Candies(flavour,ppk,kgs);
				float p1 = cd.calPrice();
				new Cart(p1);
				break;
			case 2:
				System.out.println("Enter flavour");
				flavour = obj1.nextLine();
				System.out.println("Price per dozen");
				float ppd = obj2.nextFloat();
				System.out.println("Quantity in dozen");
				int dozen = obj3.nextInt();
				Coockies ck = new Coockies(flavour,ppd,dozen);
				float p2 = ck.calPrice();
				new Cart(p2);
				break;
			case 3:
				System.out.println("Enter flavour");
				flavour = obj1.nextLine();
				System.out.println("Price per pieces");
				float ppp = obj2.nextFloat();
				System.out.println("No of pieces");
				int pieces = obj3.nextInt();
				IceCream ic = new IceCream(flavour,ppp,pieces);
				float p3 = ic.calPrice();
				new Cart(p3);
				break;
			case 4:
				System.out.println("Thank you for visiting : Quantity = "+Cart.getQuantity()+" \tPrice = "+Cart.getPrice());
				break;
			default:
				System.out.println("Invalid Choice ");		
			}
		
		}
	
		obj.close();
		obj1.close();
		obj2.close();
		obj3.close();
	}
}