package in.ineuron;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {
	
	@Autowired
	private LocalDateTime time;
	
	static {
		System.out.println("WishMessageGenerator.class file loading...");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: Zero param Constructor...");
	}
	
	//Business logic
	public String generateMessage(String userName) {
		int hour = time.getHour();
		
		if (hour < 12) {
			return "Good Morning:: "+userName;
		} 
		else if(hour <16){
			return "Good Afternoon:: "+userName;
		}
		else if(hour < 20) {
			return "Good Evening:: "+userName;
		}
		else {
			return "Good Night:: "+userName;
		}
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [time=" + time + "]";
	}
}
