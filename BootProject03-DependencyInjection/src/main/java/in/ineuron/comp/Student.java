package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	@Qualifier("java")
	private ICourse course;
	static {
		System.out.println("Student.class file loading...");
	}
	
	public Student() {
		System.out.println("Student:: Zero param constructor...");
	}
	
	public void preparation(String examName) {
		System.out.println("Student.preparation()");
		System.out.println("Course chosen :: "+course.getClass().getName());
		System.out.println("Content: "+course.courseContent());
		System.out.println("Price: "+course.price());
	}

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}
}	
