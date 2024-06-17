package day8;

public class MainThread
{
 
	public static void main(String[] args)
	{
		//Method 1
		Thread t1 = new Thread1("thread 1");
		
		//Method 2
		Thread t2 = new Thread(new Thread2("thread 2"));
		
		t1.start();
		t2.start();
		
		
		//Method 3
		new Thread (new Runnable() {
			@Override
			public void run() {
				for (int ind = 0; ind < 10; ind ++) {
					System.out.println("thread2 " + ind);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		
		//Method 4
		Runnable tt = ()->
		{
			for (int ind = 0; ind < 10; ind ++)
			{
				System.out.println("thread3 " + ind);
				try 
				{
					Thread.sleep(2000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		};
			
		Thread t4 = new Thread(tt);
		t4.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t4.isAlive());
		
		for (int ind = 0; ind < 10; ind ++) 
		{
			System.out.println("main "+ind);
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		};
		
		try
		{
			t1.join();
			t2.join();
			t4.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t4.isAlive());
	}
	
}


