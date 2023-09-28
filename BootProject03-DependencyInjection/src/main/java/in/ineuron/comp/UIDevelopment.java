package in.ineuron.comp;

import org.springframework.stereotype.Component;

@Component(value = "ui")
public class UIDevelopment implements ICourse {

	static {
		System.out.println("UIDevelopment.class file loading...");
	}
	
	public UIDevelopment() {
		System.out.println("UIDevelopment:: Zero param constructor...");
	}

	@Override
	public String courseContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
