package in.ineuron.dao;

import java.sql.SQLException;
import java.util.List;

import in.ineuron.comp.Employee;

public interface IEmployeeDao {
	public List<Employee> listAllEmployees() throws SQLException;
}
