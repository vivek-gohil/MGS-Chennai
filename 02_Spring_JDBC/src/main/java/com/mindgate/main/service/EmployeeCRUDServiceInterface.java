package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.pojo.Employee;

public interface EmployeeCRUDServiceInterface {
	boolean addNewEmployee(Employee employee);
	boolean updateEmployee(Employee employee);
	boolean deleteEmployee(int employeeId);
	Employee getEmployeeByEmployeeId(int employeeId);
	List<Employee> getAllEmployees();
}
