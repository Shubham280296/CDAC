package day2;

public class Consultant implements TaxPayer{
	
	private String name;
	private double invoice;
	public Consultant(String name, double invoice) {
		this.name = name;
		this.invoice = invoice;
	}
	@Override
	public double calTax() {
		return 0.1*invoice;
	}
}
