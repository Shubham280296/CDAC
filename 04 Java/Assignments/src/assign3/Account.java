package assign3;

public class Account implements Comparable<Account>{
	private int aid;
	private String name;
	private double balance;
	private String ifsc;
	
	public Account(int aid, String name, double balance, String ifsc) {
		super();
		this.aid = aid;
		this.name = name;
		this.balance = balance;
		this.ifsc = ifsc;
	}

	public int getAid() {
		return aid;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public String getIfsc() {
		return ifsc;
	}
	
	@Override
	public int compareTo(Account a)
	{
		return this.aid-a.aid;
	}
	
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", name=" + name + ", balance=" + balance + ", IFSC=" + ifsc + "]";
	}
	
	

}
