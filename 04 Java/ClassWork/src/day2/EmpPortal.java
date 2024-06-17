package day2;

public class EmpPortal {
	
	public void showGross(Employee e)	
	{
	System.out.println("Gross Salary : "+e.calGross());	
	}
	public void showNet(SalariedEmp e)	
	{
	System.out.println("Net Salary : "+e.calNet());	
	}

	public static void main(String[] args) {
		EmpPortal portal = new EmpPortal();
		
		SalariedEmp ob1 = new SalariedEmp(100, "aa", 15000.00);
//		System.out.print(ob1);
//		portal.showGross(ob1);
//		portal.showNet(ob1);
		SalesManager ob2 = new SalesManager(100, "aa", 15000.00,2000.00);
//		System.out.print(ob2);	
		
		Employee [] emp = new Employee[3];	
		emp[0] = new SalariedEmp(100, "aa", 15000.00);
		emp[1] = new Manager(100, "aa", 15000.00);
		emp[2] = new SalesManager(100, "aa", 15000.00,2000.00);
		
		for(Employee e  : emp)
		{
			System.out.println("1");
			portal.showGross(e);
			if (e instanceof SalariedEmp)
			{
				System.out.println("2");
				SalariedEmp ss = (SalariedEmp) e;
				portal.showNet(ss);
			}
			if (e instanceof SalesManager)
			{
				System.out.println("3");
				SalesManager ss = (SalesManager) e;
				ss.getIncentive();
			}	
		}
	}
}
