package in.ineuron.comp;

import org.springframework.stereotype.Component;

@Component(value="dotnet")
public class DotNetCourse implements ICourse{

	static {
		System.out.println("DotNetCourse.class file loading...");
	}
	
	public DotNetCourse() {
		System.out.println("DotNetCourse:: Zero param constructor...");
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
