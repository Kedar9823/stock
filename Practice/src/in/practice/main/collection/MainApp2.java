package in.practice.main.collection;

import java.util.Arrays;
import java.util.List;

public class MainApp2 {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
	    String word = "java";
	    
	    long count = strings.stream().flatMap(s-> Arrays.stream(s.split(" "))).filter(w-> w.equals(word)).count();
	
	    System.out.println("Count: "+count);
	}
}
