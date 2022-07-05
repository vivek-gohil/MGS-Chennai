package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.pojo.Employee;

@Repository
public class EmployeeCRUDRepository implements EmployeeCRUDRepositoryInterface {

	private static final String INSERT_NEW_EMPLOYEE = "INSERT INTO employee_details values(?,?,?)";
	private static final String GET_ALL_EMPLOYEE = "SELECT * FROM employee_details ORDER BY employee_id";
	private static final String GET_SINGLE_EMPLOYEE = "SELECT * FROM employee_details WHERE employee_id = ?";
	private static final String UPDATE_EMPLOYEE = "UPDATE employee_details SET name = ? , salary = ? WHERE employee_id = ?";
	private static final String DELETE_EMPLOYEE_BY_EMPLOYEE_ID = "DELETE employee_details WHERE employee_id = ?";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("addNewEmployee() of Repository");
		Object[] args = { employee.getEmployeeId(), employee.getName(), employee.getSalary() };

		int count = jdbcTemplate.update(INSERT_NEW_EMPLOYEE, args);

		if (count > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		System.out.println("updateEmployee() of Repository");
		Object[] args = { employee.getName(), employee.getSalary(), employee.getEmployeeId() };
		int count = jdbcTemplate.update(UPDATE_EMPLOYEE, args);

		if (count > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		System.out.println("deleteEmployee() of Repository");
		Object [] args = {employeeId};
		int count = jdbcTemplate.update(DELETE_EMPLOYEE_BY_EMPLOYEE_ID, args);
		if (count > 0) {
			return true;
		}
		return false;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		System.out.println("getEmployeeByEmployeeId() of Repository");
		Object[] args = { employeeId };
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(GET_SINGLE_EMPLOYEE, rowMapper, args);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		System.out.println("getAllEmployees() of Repository");
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> allEmployees = jdbcTemplate.query(GET_ALL_EMPLOYEE, rowMapper);
		return allEmployees;
	}

}
