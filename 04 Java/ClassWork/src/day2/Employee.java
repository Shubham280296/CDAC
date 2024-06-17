package day2;

public abstract class Employee {
	
	protected int Eid;
	protected String Ename;
	
	public Employee(int eid, String ename) {
		Eid = eid;
		Ename = ename;
	}
	
	public abstract double calGross();

	@Override
	public String toString() {
		return "Employee Eid=" + Eid + ", Ename=" + Ename ;
	}
	
}
