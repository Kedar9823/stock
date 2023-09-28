package in.practice.main.collection;

import java.util.Arrays;
import java.util.Comparator;

import in.practice.main.commons.Employee;

public class TestApp7 {
	public static void main(String[] args) {
		Employee[] emp = {
				new Employee(1001, "abc", "math"),
				new Employee(1005, "def", "science"),
				new Employee(1003, "hij", "economics"),
				new Employee(1006, "klo", "geography"),
				new Employee(1002, "pqr", "english"),
				new Employee(1004, "stu", "hindi"),
		};
		
		System.out.println("Employee before: "+Arrays.toString(emp));
		
		Arrays.sort(emp, (Employee o1, Employee o2) -> Integer.compare(o1.getId(), o2.getId()));
		
		System.out.println("Employee after: "+Arrays.toString(emp));
	
		
	}
}
