package assign2;

public class Account{
	private int accnum;
	private String name;
	private int pin;
	private float balance;
	public Account(int accnum, String name, int pin,float balance) 
	{
		this.accnum = accnum;
		this.name = name;
		this.pin = pin;
		this.balance = balance;
	}
	public int getAccnum() {
		return accnum;
	}

	public int getPin() {
		return pin;
	}
	public  float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance += balance;
	}
	@Override
	public String toString() {
		return "Bank accnum=" + accnum + ", name=" + name + "balance="+balance;
	}

}
