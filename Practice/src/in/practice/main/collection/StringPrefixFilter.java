package in.practice.main.collection;

import java.util.Arrays;

public class StringPrefixFilter {
	public static void main(String[] args) {
		String[] strings = {"java", "scala", "javascript", "ruby","spring","angular"};
	    String prefix = "j";
	
	    String[] array = Arrays.stream(strings).filter(s->s.startsWith(prefix)).toArray(String[] :: new);
	
	    System.out.println(Arrays.toString(array));
	}
}
