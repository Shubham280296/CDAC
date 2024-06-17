package e_commerce;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


//admin portal for performimg operatipns
public class Admin_portal {

	public static List<Cloth> clist= new ArrayList<>();
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.println("\n------Menu----------:");
            System.out.println("1. Add new Cloth");
            System.out.println("2. Update stock of a Cloth");
            System.out.println("3. Set discount of % for all clothes odf given category and barand");
            System.out.println("4. Remove cloths which are out of stock for last 2 months");
            System.out.println("5. List out cloths which are out of stock today");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            try
            {
            	int choice=sc.nextInt();
            	switch(choice)
            	{
            	case 1:
            		addNewCloth();
            		break;
            		
            	case 2:
            		System.out.println("Enter the id of cloth to update the stock: ");
            		int id=sc.nextInt();
            		updateStock(id);
            		break;
            		
            	case 3:
            		System.out.println("Enter the Category on which discount to be appplied");
            		Category cat=Category.valueOf(sc.next());
            		
            		System.out.println("Enter the brand to  appply the discount");
            		String brand=sc.next();
            		
            		setDiscounts(cat,brand);
            		break;
            		
            	case 4:
            		removeCloth();
            		break;
            		
            	case 5:
            		listOfCloth();
            		break;
            		
            	case 6:
            		System.out.println("Exiting.......");
            		System.exit(0);
            		
            	default:
            		System.out.println("Invalid Input");
 	
            	}// end of switch
            }//end of try
            
            catch(InputMismatchException e)
            {
            	System.out.println("Invalid input please enter numers");
            }//end of catch
		}//end of while
	}//end of main


	//-----1. Method to add cloths
	private static void addNewCloth() 
	{
		
		try {
			System.out.println("\nAdding new cloths");
		
			 System.out.print("Enter category MENS_TSHIRT,MENS_SHIRTS,WOMENS_JEANS: ");
			 Category cat =Category.valueOf(sc.next());

	         System.out.print("Enter Stock: ");
	         int stock = sc.nextInt();

	         System.out.print("Enter stock update date: ");
	         LocalDate update=LocalDate.parse(sc.next());
	         
	         System.out.print("Enter size (S,M,L,XL): ");
	         Size size = Size.valueOf(sc.next());
	         
	         System.out.print("Enter price: ");
	         double price =sc.nextDouble();
	         
	         System.out.println("Enter Brand:  ");
	         String brand=sc.next();
	         
	         System.out.println("Enter Color:  ");
	         String color=sc.next();

	         System.out.print("Enter discount: ");
	         double discount =sc.nextDouble();
	         //sc.nextLine();
	         
	         //adding cloths to list clist
	         clist.add(new Cloth(cat,stock,update,size,price,brand,color,discount));
	         
	         //printing added cloths
	         clist.forEach(System.out::println);
			
		}//end of try
		catch(IllegalArgumentException e)

		{
			System.out.println("Invalid input enter again");
		}//end of catch
	}
	
	//--------method to findcloth by id 
	private static Cloth findClothByID(int id) 
	{
		for(Cloth c:clist)
		{
			if(c.getId()==id)
				return c; //if id found then returns the object of that cloth
		}
		return null;//else returns null
	}
	
	
	
	//--------method 2. update stocks in cloth list 
	private static void updateStock(int id) 
	{
		Cloth i=findClothByID(id);
		if(i!=null)
		{
			//for updating stock
			System.out.println("Enter the stock to update");
			int stock=sc.nextInt();
			i.setStock(stock);//updat estock
			
			//for updating the date of stock
			System.out.println("Enter the stock to updatedate");
			LocalDate udate=LocalDate.parse(sc.next());
			i.setStockUpdateDate(udate);//updat date
				
		}
		
		else
		{
			System.out.println(" Id not found");
		}
	}
	
//---------Method.3 setting discounts for given category and brand
	private static void setDiscounts(Category cat, String brand)
	{
		//stream to filter category and barand
		clist.stream()//using stream 
		.filter(item-> item.getCategory().equals(cat) &&item.getBrand().equals(brand))
		.forEach(item->item.setDiscount(10.0));//then sets the dsiscount
		
		//printing list after discount
		clist.forEach(System.out::println);	
	}

//-------method.4 Remove cloths which are out of stock for last 2 months
	private static void removeCloth() 
	{
		LocalDate lst_two_mnths= LocalDate.now().minusDays(2);//to get last two month date
		List<Cloth> removecloth =clist.stream()
		.filter(item->item.getStockUpdateDate().isAfter(lst_two_mnths) && item.getStock()==0)//to filter 
		.toList();
		
		if(!removecloth.isEmpty())
		{
		System.out.println("\nRemoving the cloths");
		removecloth.forEach(System.out::println);
		clist.removeAll(removecloth);
		
		System.out.println("\nlist of cloths after reoving ");
		clist.forEach(System.out::println);
		}
		
		else 
		{
			System.out.println("Condition did not match ");
		}
		
	}

	//-------method.4 Remove cloths which are out of stock
	private static void listOfCloth() 
	{
		LocalDate today= LocalDate.now();// to get todays date
		 clist.stream()
		.filter(item->item.getStockUpdateDate().equals(today) && item.getStock()==0)// to check update date is today and stock is zero
		.forEach(System.out::print);//printing all those lists whose stock is zero
		
	}

}
