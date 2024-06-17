package assign3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AccountFunctions {
	public HashMap<Integer, String> accDetails(List<Account> acclst)
	{
		HashMap<Integer,String> accountDetails = new HashMap<>();
		for (Account a : acclst)
		{
			accountDetails.put(a.getAid(),a.getIfsc());
		}
		return accountDetails;
		
	}
	
	public  List<Account> filterByIFSC(List<Account> acclst,String ifsc)
	{
		List<Account> brachAccounts = new ArrayList<>();
		for (Account a : acclst)
		{
			if(a.getIfsc()== ifsc)
			{
				brachAccounts.add(a);
			}
		}
		return brachAccounts;
	}
	
	public List<Account> filterByBalance(List<Account> acclst,double minbalance)
	{
		List<Account> balanceAccounts = new ArrayList<>();
		for (Account a : acclst)
		{
			if(a.getBalance()>= minbalance)
			{
				balanceAccounts.add(a);
			}
		}
		return balanceAccounts;
	}

}
