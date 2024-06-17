package day2;

public class Manager extends SalariedEmp {
	protected static int travelallow = 1500;
	
	
	public Manager(int eid, String ename, double salary) {
		super(eid, ename, salary);
	}

	@Override
	public double calGross(){
		double rentallow = salary*0.1;
		return super.calGross()+rentallow+travelallow;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Gross =" + calGross()+ ", Net=" + calNet() ;
	}

	

}
