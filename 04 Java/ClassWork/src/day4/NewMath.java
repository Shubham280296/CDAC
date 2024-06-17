package stylewatch;

import java.time.LocalDate;

import java.util.ArrayList;

import java.util.InputMismatchException;

import java.util.List;

import java.util.Scanner;

public class Watchmain 

{

	public static List<Watch> wlist= new ArrayList<>();	public static Scanner sc= new Scanner(System.in);

	

	public static void main(String[] args)

	{

		 while (true) {

	            System.out.println("\nMenu:");

	            System.out.println("1. Add new Watch");

	            System.out.println("2. Update stock of a Watch");

	            System.out.println("3. Set discount of 10% for all the watches which are 1 year old");

	            System.out.println("4. Remove Watches which are never sold once listed in 18 months");

	            System.out.println("5. Exit");

	            System.out.print("Enter your choice: ");

	            try {

	            	int choice=sc.nextInt();

	            	switch(choice)

	            	{

	            		case 1:

	            			addNewWatch();

	            			break;

	            			

	            		case 2:

	            			System.out.println("Enter watch id :");

	            			int id=sc.nextInt();

	            			

	            			updatestock(id);

	            			break;

	            			

	            		case 3:

	            			setDiscount();

	            			break;

	            			

	            		case 4:

	            			removewatch();

	            			break;

	            			

	            		case 5:

	            			System.out.println("Exiting.........");

	            			System.exit(0);

	            			

	            		default:

	            			System.out.println("Invalid input ");

			

	            	}

	            	

	            }

	            catch(InputMismatchException e)

	            {

	            	System.out.println("Invalid input please enter valid no");

	            	sc.next();

	            }

	}

}

	

	private static void removewatch() {

		LocalDate eigthenmonth= LocalDate.now().minusMonths(18);

		List<Watch> rwatch=new ArrayList<>(); 

		for(Watch w:wlist)

		{

			if(w.getStockListingDate().isAfter(eigthenmonth))

			{

				System.out.println(" --------------------------------------------------");

				if(w.getStockListingDate().equals(w.getStockUpdatePrice()))

				{

					System.out.println("Removing   " + w);

					rwatch.add(w);

				}

				

			}

			else

			{

				System.out.println("No entries found");

			}

		}

		wlist.removeAll(rwatch);

	}

	private static void setDiscount() 

	{

		LocalDate oneyear=LocalDate.now().minusYears(1);

		for(Watch w:wlist)

		{

			if(w.getStockListingDate().isBefore(oneyear))

			{

				System.out.println("Stock before updating");

				System.out.println(w);

				w.setDiscounts(10.0);

				

				System.out.println("Updated stock is\n:");

				System.out.println(w);

			}

		}	

	}

	private static Watch findById(int id)

	{

		for(Watch w:wlist)

		{

			if(w.getId()==id)

				return w;

		}

		return null;

	}

	private static void updatestock(int id)

	{

	  Watch w=findById(id);

	  if(w!=null)

	  {

		  System.out.println("Enter the stock to update");

		  int qnt=sc.nextInt();

		  w.setStock(qnt);

		  System.out.println(w);

	  }

	  

	  else

	  {

		  System.out.println("Id not found");

	  }

		

	}

	private static void addNewWatch() 

	{

		

		try {

		System.out.println("Enter watch details as\n");

		 System.out.print("Enter name: ");

         String name = sc.next();

         

         System.out.print("Enter category (MEN/WOMEN): ");

         Category category = Category.valueOf(sc.nextLine());

         

         System.out.print("Enter brand (CASIO/TITAN): ");

         Brand brand = Brand.valueOf(sc.nextLine());

         

         System.out.print("Enter shape (SQUARE/RECTANGLE/ROUND): ");

         Shape shape = Shape.valueOf(sc.nextLine());

         

         //Shape shaape =Shape.valueOf(sc.nextLine())

         //Brand brand1=Brand.valueOf(sc.nextLine());

         

         System.out.print("Enter style (CASUAL/SPORT/WEDDING): ");

         String style=sc.nextLine();

         

         System.out.print("Enter stock quantity: ");

         int stock=sc.nextInt();

            

         System.out.print("Enter stock listing date: ");

         LocalDate sld=LocalDate.parse(sc.next());

         

         System.out.print("Enter stock listing date: ");

         LocalDate sud=LocalDate.parse(sc.next());

         

         System.out.print("Enter price: ");

         double price=sc.nextDouble();

         

         System.out.print("Enter discounts: ");

         double discounts=sc.nextDouble();

         sc.nextLine();

         

         Watch newwatch= new Watch(name,category,brand,shape,style,stock,sld,sud,price,discounts);

         wlist.add(newwatch);

         for(Watch w:wlist)

         System.out.println(w);

         

		}

		catch(IllegalArgumentException e)

		{

			System.out.println("Invalid input enter again");

		}

         

	}

	

}
