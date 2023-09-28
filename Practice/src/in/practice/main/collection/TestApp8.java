package in.practice.main.collection;

import java.util.HashMap;
import java.util.Map;

public class TestApp8 {
	public static void main(String[] args) {
		String str = "Hi Hello How are you Ok Bye Take Care!$#%";
		
		str = str.replaceAll("\\s"," ").replaceAll("[^A-Za-z0-9]", "");
	
		System.out.println(str);
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			map.compute(ch, (k,v) -> (v == null) ? 1:++v);
			
		}
		
		System.out.println(map);
	}
}
