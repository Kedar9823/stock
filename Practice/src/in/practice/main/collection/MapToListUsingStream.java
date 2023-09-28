package in.practice.main.collection;

import in.practice.main.commons.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class MapToListUsingStream {
	public static void main(String[] args) {
		Map<Integer, Employee> map = new HashMap<>();
		map.put(101, new Employee(101, "Robert", "IT"));
		map.put(102, new Employee(102, "Mary", "HR"));
		map.put(103, new Employee(103, "Johnson", "Admin"));
		map.put(104, new Employee(104, "William", "QA"));
		map.put(105, new Employee(105, "Smith", "IT"));
		
		List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
		
		List<Employee> valueList = map.values().stream().collect(Collectors.toList());
		
		System.out.println(keyList);
		System.out.println(valueList);
	}
}
