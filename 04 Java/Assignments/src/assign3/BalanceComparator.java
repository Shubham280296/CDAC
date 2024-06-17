package assign3;

import java.util.Comparator;

public class BalanceComparator implements Comparator<Account>{

	@Override
	public int compare(Account a1, Account a2) {
		return (int)(a1.getBalance()-a2.getBalance());
	}
	

}
