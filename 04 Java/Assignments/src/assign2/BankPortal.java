package assign2;

import java.util.ArrayList;
import java.util.List;
public class BankPortal {

	
	List<Account> accounts;
	
	public BankPortal(List<Account> accounts)
	{
		this.accounts = accounts;
	}
	
	
	public void withdraw(Account acc,float amt) throws IncorrectAccountCredentials,IncorrectAmount,InsufficientBalance
	{
		for (Account ac:accounts)
		{
			if (acc.getPin()==ac.getPin() && acc.getAccnum()==ac.getAccnum())
			{
				if ((amt%100) != 0)
				{
					throw new IncorrectAmount("Incorrect amount: please enter amount in multiples of 100");
				}
				else if (acc.getBalance()<amt)
				{
					throw new InsufficientBalance("Insufficient balace");
				}	
				else
				{
					acc.setBalance(-amt);
					System.out.println("Amount Successfully withdrawn");
					System.out.println(acc.toString());
					return;
				}
			}
		}
		throw new IncorrectAccountCredentials("Invalid Credentials");
	}
	
	public void deposit(Account acc,float amt) throws IncorrectAccountCredentials,LimitExceed
	{
		for (Account ac:accounts)
		{
			if (acc.getPin()==ac.getPin() && acc.getAccnum()==ac.getAccnum())
			{
				if (amt>100000)
				{
					throw new LimitExceed("Daily deposit amount limit exceeded");
				}
				else
				{
				acc.setBalance(amt);
				System.out.println("Amount Successfully deposited");
				System.out.println(acc.toString());
				return;
				}
			}
		}
		throw new IncorrectAccountCredentials("Invalid Credentials");
	}
	
		
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<>();
		accounts.add(new Account(1233456,"AAA",123475,105486.83f));
		accounts.add(new Account(4565795,"BBB",123695,254860.54f));
		
		BankPortal bkp = new BankPortal(accounts);
		try {
			bkp.withdraw(new Account(1233456,"AAA",123475,105486.83f),850);
			bkp.deposit(new Account(4565795,"BBB",123695,254860.54f),800);
		}
		catch(IncorrectAccountCredentials|IncorrectAmount|InsufficientBalance|LimitExceed e)
		{	
			System.out.print(e);
		}
		
	}
}
