package in.ineuron;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootProject02DependencyInjectionApplication {

	static {
		System.out.println("BootProject02DependencyInjectionApplication.class file is loading...");
	}
	
	
	public BootProject02DependencyInjectionApplication() {
		System.out.println("BootProject02DependencyInjectionApplication:: Zero param Constructor...");
	}

	@Bean
	public LocalDateTime time() {
		System.out.println("Generate Object");
		return LocalDateTime.now();
	}
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProject02DependencyInjectionApplication.class, args);
		
		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		System.out.println(wmg);
		System.out.println(wmg.generateMessage("Kedar"));
		
		((ConfigurableApplicationContext) context).close();
	}

}
