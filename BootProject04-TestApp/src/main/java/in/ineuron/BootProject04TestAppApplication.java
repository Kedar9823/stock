package in.ineuron;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Employee;
import in.ineuron.dao.IEmployeeDao;

@SpringBootApplication
public class BootProject04TestAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProject04TestAppApplication.class, args);
	
		IEmployeeDao dao = context.getBean(IEmployeeDao.class);
		
		try {
			List<Employee> emplist = dao.listAllEmployees();
			System.out.println(emplist);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) context).close();
	}

}
