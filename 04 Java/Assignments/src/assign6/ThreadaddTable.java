package assign6;

public class ThreadaddTable implements Runnable{
	static int n1;
	static int n2;
	
	public void run() {
		for (int i = 1; i < 11; i ++) 
		{
			if (Thread.currentThread().getName() == "add")
			{
				System.out.println("add " +(n1+i-1));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (Thread.currentThread().getName() == "table")
			{
				System.out.println("table " +(n2*i));
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