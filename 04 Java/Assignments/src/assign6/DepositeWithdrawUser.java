package assign6;


public class DepositeWithdrawUser {
	public static void main(String[] args) 
	{
		int []accdep = {15000,2000,5000} ;
		int []accwith = {4000,4000,1000};
		
		DepositeWithdraw account= new DepositeWithdraw();
		
		Runnable accdeposite = new Runnable ()
		{
			@Override
			public void run()
			{
				for (int i=0;i<3;i++)
				{
					account.deposite(accdep[i]);
					try 
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					
				}
			}
			
		};
		
		Runnable accwithdraw = new Runnable ()
		{
			@Override
			public void run()
			{
				for (int i=0;i<3;i++)
				{
					account.withdraw(accwith[i]);
					try 
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					
				}
			}
			
		};

		
		new Thread(accdeposite).start();;	
		new Thread(accwithdraw).start();
		
	}

}
