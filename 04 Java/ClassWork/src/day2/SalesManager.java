package day2;

public class SalesManager extends Manager {


	protected double incentive;
	
	
	public SalesManager(int eid, String ename, double salary,double incentive) {
		super(eid, ename, salary);
		this.incentive = incentive;
	}
	
	@Override
	public double calGross(){
		return super.calGross()+incentive;
	}
	
	public double calNet() {
		double tax = 0.3*calGross();
		return calGross()-tax;
	}

	@Override
	public String toString() {
		return super.toString()+ ", Incentive=" +incentive;
	}

	public void getIncentive(){
		System.out.println(incentive);
	}
	

	@Override
	public double calTax()
	{
		return 0.3*calGross();
	}

}
