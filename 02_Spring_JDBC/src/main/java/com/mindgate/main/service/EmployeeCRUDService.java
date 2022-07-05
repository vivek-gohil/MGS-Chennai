package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.pojo.Employee;
import com.mindgate.main.repository.EmployeeCRUDRepositoryInterface;

@Service
public class EmployeeCRUDService implements EmployeeCRUDServiceInterface {

	@Autowired
	private EmployeeCRUDRepositoryInterface crudRepositoryInterface;

	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("addNewEmployee() of Service");
		return crudRepositoryInterface.addNewEmployee(employee);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		System.out.println("updateEmployee() of Service");
		return crudRepositoryInterface.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		System.out.println("deleteEmployee() of Service");
		return crudRepositoryInterface.deleteEmployee(employeeId);
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		System.out.println("getEmployeeByEmployeeId() of Service");
		return crudRepositoryInterface.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		System.out.println("getAllEmployees() of Service");
		return crudRepositoryInterface.getAllEmployees();
	}

}
