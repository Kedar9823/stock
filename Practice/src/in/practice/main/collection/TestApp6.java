package in.practice.main.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import in.practice.main.commons.Employee;

public class TestApp6 {
	public static void main(String[] args) {
		Integer[] arr = {
			40,60,70,90,20,30,10,80,50
		};
		
		System.out.println("Before: "+Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
			
		});
		
		System.out.println("After: "+Arrays.toString(arr));
		
		Employee[] emp = {
				new Employee(1001, "abc", "math"),
				new Employee(1005, "def", "science"),
				new Employee(1003, "hij", "economics"),
				new Employee(1006, "klo", "geography"),
				new Employee(1002, "pqr", "english"),
				new Employee(1004, "stu", "hindi"),
		};
		
		System.out.println("Employee before: "+Arrays.toString(emp));
		Arrays.sort(emp,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return Integer.compare(o1.getId(), o2.getId());
			}
			
		});
		
		System.out.println("Employee after: "+Arrays.toString(emp));
	
	}
}
