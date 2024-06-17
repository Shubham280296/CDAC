package day5;

import java.util.*;

public class EmployeeCollection {
	public static HashMap<String, Set<String>> getSkilledEmp(List<Employee> emplst)
	{
		HashMap<String, Set<String>> skillmap = new HashMap<>();
		for (Employee e : emplst)
		{
			if(e.skills.contains("java"))
			{
				skillmap.put(e.name,e.skills);
			}
		}
		return skillmap;
	}

	public static void main(String[] args) {
		Set<String> skills1 = new TreeSet<String>();
		skills1.add("java");
		skills1.add("javascript");
		
		Set<String> skills2 = new TreeSet<String>();
		skills2.add("java");
		skills2.add("python");
		
		Set<String> skills3 = new TreeSet<String>();
		skills3.add("python");
		skills3.add("c++");
		
		List<Employee> emplst = new ArrayList<>();
		emplst.add(new Employee(555,"aaa",65000.0,skills1));
		emplst.add(new Employee(222,"bbb",55000.0,skills2));
		emplst.add(new Employee(888,"ppp",60000.0,skills1));
		
		for (Employee emp:emplst) 
		{
			System.out.println(emp);
		}
		
		Collections.sort(emplst);
		System.out.println("Sorted by id");
		for (Employee emp:emplst) 
		{
			System.out.println(emp);
		}
		
		int found = Collections.binarySearch(emplst,new Employee(555,null,0.0,null));
		System.out.println(found);
		
		
		Collections.sort(emplst, new NameComparator());
		System.out.println("Sorted by name");
		for (Employee emp:emplst) 
		{
			System.out.println(emp);
		}
		
		
		
		Collections.sort(emplst, new SalaryComparator());
		System.out.println("Sorted by Salary");
		for (Employee emp:emplst) 
		{
			System.out.println(emp);
		}
		HashMap<String, Set<String>> skillmap = getSkilledEmp(emplst);
		System.out.println(skillmap);
		
	}
}
