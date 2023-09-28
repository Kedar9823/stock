package in.practice.main.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestApp4 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(11);
		numbers.add(23);
		numbers.add(35);
		numbers.add(47);
		numbers.add(52);
		
		List<Integer> list = numbers.stream().map(i->i -10).collect(Collectors.toList());
		
		System.out.println(list);
	}
}
