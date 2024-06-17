package assign6;

public class DepositeWithdraw {

	double balance;
	double minbalance = 10000;
	
	public synchronized void deposite(double value)
	{		
		balance +=value;
		System.out.println("Deposited : "+value+"Balance : "+balance);
		notify();
		
	}
		
		
	public synchronized void withdraw(double value)
	{
		if (value>(balance-minbalance))
		{
			try 
			{
				System.out.println("Insufficient Balance");
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		balance -= value;
		System.out.println("withdrawn : "+value+"Balance : "+balance);
	}
}
