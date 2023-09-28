package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.comp.Employee;

@Component
public class EmployeeDao implements IEmployeeDao {

	@Autowired
	private DataSource dataSource;
	private static String SQL_SELECT = "select empId, empName, empAge, empDept from employee";
	
	@Override
	public List<Employee> listAllEmployees() throws SQLException {
		System.out.println("Datasource:: "+dataSource.getClass().getName());
		List<Employee> emplist = new ArrayList<>();
		try(Connection connection = dataSource.getConnection();
				PreparedStatement pre = connection.prepareStatement(SQL_SELECT);
				ResultSet result = pre.executeQuery()){
				
				Employee emp = new Employee();
				while(result.next()) {
					emp.setEmpId(result.getInt(1));
					emp.setEmpName(result.getString(2));
					emp.setEmpAge(result.getInt(3));
					emp.setEmpDept(result.getString(4));
				}
				emplist.add(emp);
		}
		return emplist;
	}

}
