package assign6;

public class Threadeveodd implements Runnable{
	
	public void run() {
		for (int i = 1; i < 21; i ++) 
		{
			if (Thread.currentThread().getName() == "odd")
			{
				if (i%2!=0)
				{
					System.out.println("Odd " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			else if (Thread.currentThread().getName() == "even")
			{
				if (i%2==0)
				{
					System.out.println("Even " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}	
	
}