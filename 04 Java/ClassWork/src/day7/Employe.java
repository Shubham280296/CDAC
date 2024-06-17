package day7;

import java.util.Set;

public class Employe implements Comparable<Employe> {
	int empid;
	String name;
	Double salary;
	Set<String> skills;
	String department;
	public Employe(int empid, String name, Double salary,String department, Set<String> skills) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.skills = skills;
		this.department = department;
	}
	
	
	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<String> getSkills() {
		return skills;
	}


	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}


	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return this.department;
	}
	
	@Override
	public int compareTo(Employe o) {
		
		return this.empid-o.empid;
	}
	
	@Override
	public String toString() {
		return "Employe [empid=" + empid + ", name=" + name + ", salary=" + salary + "department= "+ department+ ", skills=" + skills + "]";
	}

}
