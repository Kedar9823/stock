package in.practice.main.collection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	public static void main(String[] args) {
		// Using JDK 9 way to create a List
		List<Object[]> list = List.of(
				new Object[] {10,"AAA"},
				new Object[] {11,"BBB"},
				new Object[] {12,"CCC"},
				new Object[] {13,"DDD"},
				new Object[] {14,"EEE"}
				);
		
		Map<Integer, String> collect = 
				list.stream().collect(
				Collectors.toMap(
						ob-> Integer.valueOf(ob[0].toString()), 
						ob -> ob[1].toString())
				);
		
		System.out.println(collect);
	}
}
