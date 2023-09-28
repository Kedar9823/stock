package in.practice.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class MainApp {
	
	public static final String MESSAGE = "Access me!";
	
	public static void main(String[] args) {
		
		System.out.println("Current Time: "+getTime());
		display();
	}
	
	public static String getTime() {
		
		LocalDateTime time = LocalDateTime.now();  

		return time.toString();
	}
	
	public static void display() {
		System.out.println("Current Time: "+getTime());
		
		SubClass sb = new SubClass();
		sb.print();
	}
}
