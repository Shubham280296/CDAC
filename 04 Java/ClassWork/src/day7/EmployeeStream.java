package day7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import day5.Employee;

public class EmployeeStream {
	public static List<Employe> setEmployee() {
		Set<String> skills1 = new TreeSet<String>();
		skills1.add("java");
		skills1.add("javascript");
		
		Set<String> skills2 = new TreeSet<String>();
		skills2.add("java");
		skills2.add("python");
		
		Set<String> skills3 = new TreeSet<String>();
		skills3.add("python");
		skills3.add("c++");
		
		List<Employe> emplst = new ArrayList<>();
		emplst.add(new Employe(555,"aaa",65000.0,"IT", skills1));
		emplst.add(new Employe(222,"bbb",45000.0,"IT", skills2));
		emplst.add(new Employe(888,"ppp",60000.0,"SALES", skills1));
		return emplst;
		
	}
	public static void main(String []args) {
		List<Employe> emplist = setEmployee();
		Stream<Employe> estream = emplist.stream();
		estream.forEach(System.out::println);
		
		System.out.println("--------SORTING BY ID--------");
		estream = emplist.stream();
		estream.sorted().forEach(System.out::println);
		
		System.out.println("--------SORTING BY NAME--------");
		estream = emplist.stream();
		Comparator<Employe> byName = Comparator.comparing(Employe::getName);
		estream.sorted(byName).forEach(System.out::println);
		
		System.out.println("--------SORTING BY NAME DEPARTMENT WISE--------");
		estream = emplist.stream();
		Comparator<Employe> byDepartment = Comparator.comparing(Employe::getDepartment).thenComparing(byName);
		estream.sorted(byDepartment).forEach(System.out::println);
	
		System.out.println("--------DEPARTMENT WISE EMPLOYEE LIST--------");
		estream = emplist.stream();
		Function<Employe, Department> empdepart = (emp)->new Department(emp.getName(), emp.getDepartment());
		estream.map(empdepart).forEach(System.out::println);
	
		System.out.println("--------EMPLOYEE SALARY >= 600000--------");
		estream = emplist.stream();
		Predicate<Employe> empSalary = (emp)->emp.getSalary() >= 60000;
		estream.filter(empSalary).forEach(System.out::println);
		
		
		System.out.println("--------EMPLOYEE WITH SKILL JAVA--------");
		estream = emplist.stream();
		Predicate<Employe> empJava = (emp)->emp.getSkills().contains("java");
		estream.filter(empSalary).forEach(System.out::println);
		
		
		System.out.println("--------EMPLOYEE WITH MINIMUM SALARY--------");
		estream = emplist.stream();
		OptionalDouble minSalary = estream.mapToDouble(Employe::getSalary).min();
		System.out.println(minSalary);
		
		System.out.println("--------EMPLOYEE WITH MAXIMUM SALARY--------");
		estream = emplist.stream();
		OptionalDouble maxSalary = estream.mapToDouble(Employe::getSalary).max();
		System.out.println(maxSalary);
		
		System.out.println("--------EMPLOYEE WITH AVERAGE SALARY--------");
		estream = emplist.stream();
		OptionalDouble avgSalary = estream.mapToDouble(Employe::getSalary).average();
		System.out.println(avgSalary);
		
		System.out.println("--------EMPLOYEE WITH TOTAL SALARY--------");
		estream = emplist.stream();
		double totalSalary = estream.mapToDouble(Employe::getSalary).sum();
		System.out.println(totalSalary);
	
		System.out.println("--------GROUPING OF EMPLOYEE BY DEPARTMENT--------");
		estream = emplist.stream();
		Map<String, List<Employe>> groupEmps = estream.collect(Collectors.groupingBy(Employe::getDepartment));
		System.out.println(groupEmps);
	}
}
