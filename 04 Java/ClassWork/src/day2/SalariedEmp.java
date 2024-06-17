package day2;

public class SalariedEmp extends Employee implements TaxPayer{
	
	protected double salary;
	
	public SalariedEmp(int eid, String ename,double salary) {
		super(eid, ename);
		this.salary = salary;
	}

	@Override
	public double calGross(){
		double da = 0.12*salary;
		double hra = 0.4*salary;
		return salary + da + hra;
	}

	public double calNet() {
		double tax = 0.2*calGross();
		return calGross()-tax;
	}

	@Override
	public String toString() {
		return super.toString()+", Gross =" + calGross()+ ", Net=" + calNet();
	}
	
	@Override
	public double calTax()
	{
		return 0.2*calGross();
	}
	
}
