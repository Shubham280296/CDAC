package assign6;


public class ReadWrite 
{

	public static void main(String[] args) 
	{
		
		StrbReadWrite strb= new StrbReadWrite();
		
		Runnable write = new Runnable ()
		{
			@Override
			public void run()
			{
				for (int i=0;i<4;i++)
				{
					strb.setValue(i);
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

		Runnable read = new Runnable()
		{
			@Override
			public void run()
			{
				strb.getValue();
			}
			
		};
		
		new Thread(write).start();;	
		new Thread(read).start();
		
	}

}
