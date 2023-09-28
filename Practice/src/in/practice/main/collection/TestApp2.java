package in.practice.main.collection;

import java.util.List;
import java.util.stream.Collectors;

public class TestApp2 {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(45,23,54,76,23,57,42);
		
		List<Integer> result = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		
		System.out.println(result);
	}
}
