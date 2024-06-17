package assign3;

import java.util.*;

public class AccountPortal {

	public static void main(String[] args) {
		// Q1
		List<Account> acclst = new ArrayList<>();
		acclst.add(new Account(101,"aaa",65000.0,"HDFC079"));
		acclst.add(new Account(879,"bbb",55000.0,"IDBI068"));
		acclst.add(new Account(524,"ppp",60000.0,"HDFC079"));
		System.out.println(acclst);
		
		//Q2
		Collections.sort(acclst);
		System.out.println("************Sorted by id*************");
		System.out.println(acclst);
		
		//Q3
		int found = Collections.binarySearch(acclst,new Account(879,null,0.0,null));
		System.out.println("*************Binary search***************\nIndex");
		System.out.println(found);
		
		
		Collections.sort(acclst, new NameComparator());
		System.out.println("************Sorted by name************");
		System.out.println(acclst);
		
		Collections.sort(acclst, new BalanceComparator());
		System.out.println("************Sorted by Salary***********");
		System.out.println(acclst);
		
		AccountFunctions obj =new AccountFunctions();
		
		//Q4 
		String ifsc = "HDFC079";
		List<Account> branchAccount = obj.filterByIFSC( acclst, ifsc);
		System.out.println("************Filter by IFSC HDFC079***********");
		System.out.println(branchAccount);
		
		String ifsc1 = "IDBI068";
		List<Account> branchAccount1 = obj.filterByIFSC( acclst, ifsc1);
		System.out.println("************Filter by IFSC IDBI068***********");
		System.out.println(branchAccount1);
		//Q4 
		Double minbalance = 60000.0;
		List<Account> balanceAccounts = obj.filterByBalance( acclst, minbalance);
		System.out.println("************Filter by minimum balance***********");
		System.out.println(balanceAccounts);
		
		//Q5
		HashMap<Integer, String> accountDetails = obj.accDetails(acclst);
		System.out.println(accountDetails);
	}
}

