package in.ineuron.comp;

import org.springframework.stereotype.Component;

@Component(value="java")
public class JavaCourse implements ICourse {

	static {
		System.out.println("JavaCourse.class file loading...");
	}
	
	public JavaCourse() {
		System.out.println("JavaCourse:: Zero param constructor...");
	}

	@Override
	public String courseContent() {
		// TODO Auto-generated method stub
		return "1.OOPS  2.ExceptionHanding  3.Collection 4.SpringFramework";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 400.0f;
	}

}
