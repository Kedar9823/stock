package in.practice.main.collection;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		  Integer[] array = {5, 10, 3, 7, 2, 10, 5};
		  
		  Integer[] distinct = Arrays.stream(array).distinct().toArray(Integer[] :: new);
		  
		  System.out.println(Arrays.toString(distinct));
	}
}
