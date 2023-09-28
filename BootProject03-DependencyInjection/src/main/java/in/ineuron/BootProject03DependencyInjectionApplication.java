package in.ineuron;


import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Student;

@SpringBootApplication
public class BootProject03DependencyInjectionApplication {

	static {
		System.out.println("BootProject03DependencyInjectionApplication.class file is loading...");
	}
	
	
	public BootProject03DependencyInjectionApplication() {
		System.out.println("BootProject03DependencyInjectionApplication:: Zero param Constructor...");
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProject03DependencyInjectionApplication.class, args);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Student std = context.getBean(Student.class);
		System.out.println(std);
		std.preparation("Java");
		
		((ConfigurableApplicationContext) context).close();
	}

}
