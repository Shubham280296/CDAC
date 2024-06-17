package Lab_Exam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Portal {
	// Create list of toys 
	static List<PetsToy> toylst = new ArrayList<>();
	public static List<PetsToy> toydictionary()
	{
		toylst.add(new PetsToy("Squeaky Ball","Foodie Puppies","Cat","rubber",75,LocalDate.of(2024, 03, 28), 75.50f));
		toylst.add(new PetsToy("Solitaire Stratergy Game","FutureKart","Dog","Plastic",45,LocalDate.of(2023, 04, 05), 500f));
		toylst.add(new PetsToy("Monopoly","Foodie Puppies","Cat","Plastic",25,LocalDate.of(2023, 8, 28),800f));
		return toylst;
	}

	
	//Add toys to list
	public static void add()
	{
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter Toy name");
		String name = obj1.nextLine();
		System.out.println("Enter toy brand");
		String brand = obj1.nextLine();
		System.out.println("Enter Target species");
		String targetSpecies = obj1.nextLine();
		System.out.println("Enter material");
		String material = obj1.nextLine();
		System.out.println("Enter Stock");
		int stock = obj1.nextInt();
		LocalDate date = LocalDate.now();
		System.out.println("Enter price");
		float price = obj1.nextFloat();
		
		toylst.add(new PetsToy(name,brand,targetSpecies,material,stock,date,price));
		System.out.println("Toy added successfully");
		
		for(PetsToy toy2 :toylst)
		{
			System.out.println(toy2);
		}
		obj1.close();
	}
	
	
	//Update Stock of toys
	public static void updateStock()
	{
		Scanner obj2 = new Scanner(System.in);
		System.out.println("Choose ID of toy to update stock");
		int id = obj2.nextInt();
		for (PetsToy toy :toylst)
		{
			if (toy.getId()==id)
			{
				System.out.println("New Stock");
				int stock = obj2.nextInt();
				toy.setStock(stock);
				LocalDate updatedate = LocalDate.now();
				toy.setUpdateDate(updatedate);
				
			}
		}
		for(PetsToy toy2 :toylst)
		{
			System.out.println(toy2);
		}
		obj2.close();
	}
	
	
	
	//Set discount
	public static void setDiscount()
	{
		for (PetsToy toy :toylst)
		{
			LocalDate today = LocalDate.now();
			today.minus(1, ChronoUnit.YEARS);
			if (toy.getListingDate().isBefore(today))
			{
				toy.setDiscount(0.2f);
				
			}
		}
		for(PetsToy toy2 :toylst)
		{
			System.out.println(toy2);
		}
	}
	
	
	
	//Remove toy
	public static PetsToy removeToys()
	{
		for (PetsToy toy :toylst)
		{
			LocalDate today = LocalDate.now();
			today.minus(9, ChronoUnit.MONTHS);
			if (toy.getUpdateDate().isBefore(today)) {
				return toy;
			}
		}
		return null;
		
	}
	
	
	
	public static void main (String[] args)
	{
		List<PetsToy> toylst = toydictionary();
		Scanner obj = new Scanner(System.in);
		int ch = 1;
		while (ch!=5) 
		{
			System.out.println("1.Add new Toy\n2.Update stock of a toy\n3.Set discount of 20% for all toys which are 1 year old\n4.Remove Toys which are never sold once listed in 9 months\n5.Exit\nChoice-");
			ch = obj.nextInt();
			switch (ch)
			{			
			case 1:
				add();
				break;
			case 2 :
				updateStock();
				break;
			case 3:
				setDiscount();
				break;
			case 4:
				PetsToy toy= removeToys();
				toylst.remove(toy);
				for(PetsToy toy2 :toylst)
				{
					System.out.println(toy2);
				}
				break;
			case 5: 
				System.out.println("Thank you for visiting.....");
				break;
			default:
				System.out.println("Invalid input");
			
			}	
		}	
		obj.close();
	}
}























































































