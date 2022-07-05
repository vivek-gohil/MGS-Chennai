package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.pojo.Employee;

public interface EmployeeCRUDRepositoryInterface {
	boolean addNewEmployee(Employee employee);
	boolean updateEmployee(Employee employee);
	boolean deleteEmployee(int employeeId);
	Employee getEmployeeByEmployeeId(int employeeId);
	List<Employee> getAllEmployees();
}
