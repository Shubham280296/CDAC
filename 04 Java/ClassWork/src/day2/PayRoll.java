package day2;

public class PayRoll {
	
	public static void processTax(TaxPayer payer)
	{
		System.out.println("Tax payable : " + payer.calTax());
	}

	
	public static void main(String[] args) {
		
		PayRoll tax = new PayRoll();
		TaxPayer [] emp = new TaxPayer[3];	
		emp[0] = new SalariedEmp(100, "aa", 15000.00);
		emp[1] = new Manager(100, "aa", 15000.00);
		emp[2] = new SalesManager(100, "aa", 15000.00,2000.00);
		for(TaxPayer e  : emp)
		{
			PayRoll.processTax(e);
			}	

	}

}
