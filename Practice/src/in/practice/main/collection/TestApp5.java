package in.practice.main.collection;

import java.util.ArrayList;
import java.util.List;

public class TestApp5 {
	public static void main(String[] args) {
		 List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	        
	        
	        numbers.stream().map(num -> num * num).forEach(square -> System.out.println("Square: "+square));
	}
}
