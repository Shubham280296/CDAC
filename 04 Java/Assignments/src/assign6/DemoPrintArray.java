package assign6;

public class DemoPrintArray
{
	public static void main(String[] args)

	{
		Print p =new Print();
		int []arr1 = {1,2,3,4,5};
		int []arr2 = {10,20,30,40,50};
				
		Thread one = new Thread (new Runnable() 
		{
			@Override
			public void run() 
			{
				synchronized(p) 
				{
					p.printArray(arr1);
					
				}
			}
				
		});
			
		Thread two = new Thread (new Runnable() 
		{
			@Override
			public void run() 
			{
				synchronized(p) 
				{
					
					p.printArray(arr2);
		
				}
			}
				
		});
		
		
		one.start();
		two.start();
		
	}
}
