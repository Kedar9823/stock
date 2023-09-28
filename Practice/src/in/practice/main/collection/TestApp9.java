package in.practice.main.collection;

import java.util.StringJoiner;

public class TestApp9 {
	public static void main(String[] args) {
		StringJoiner str = new StringJoiner(",");
		
		str.add("A").add("B").add("C");
		
		System.out.println(str);
		
		StringJoiner str2 = new StringJoiner(":");
		
		str2.add("D").add("E");
		
		System.out.println(str2);

		System.out.println(str.merge(str2));
	}
}
