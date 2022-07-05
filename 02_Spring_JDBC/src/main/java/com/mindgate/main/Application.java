package com.mindgate.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mindgate.main.pojo.Employee;
import com.mindgate.main.service.EmployeeCRUDService;
import com.mindgate.main.service.EmployeeCRUDServiceInterface;

@SpringBootApplication
public class Application {

	public static EmployeeCRUDServiceInterface employeeCRUDServiceInterface;

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		System.out.println("Database Connection Success");

		employeeCRUDServiceInterface = applicationContext.getBean("employeeCRUDService", EmployeeCRUDService.class);

//		Employee employee = new Employee(102, "Suman", 1000);
//		
//		boolean result = employeeCRUDServiceInterface.addNewEmployee(employee);
//		if (result) {
//			System.out.println("Employee added successfully");
//		} else {
//			System.out.println("Failed to add Employee");
//		}

//		System.out.println("----------------------------");
//		List<Employee> allEmployees = employeeCRUDServiceInterface.getAllEmployees();
//		for (Employee employee : allEmployees) {
//			System.out.println(employee);
//		}
//		System.out.println("----------------------------");

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter employeeId");
//		int employeeId = scanner.nextInt();
//
//		Employee employee 
//			= employeeCRUDServiceInterface
//							.getEmployeeByEmployeeId(employeeId);
//		System.out.println(employee);

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter employeeId");
//		int employeeId = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("Enter new Name");
//		String name = scanner.nextLine();
//		System.out.println("Enter new Salary");
//		double salary = scanner.nextDouble();
//
//		Employee employee = new Employee(employeeId, name, salary);
//
//		boolean result 
//				= employeeCRUDServiceInterface.updateEmployee(employee);
//
//		if (result) {
//			System.out.println("Employee updated successfully");
//		} else {
//			System.out.println("Failed to update ");
//		}

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter employeeId");
		int employeeId = scanner.nextInt();

		boolean result = employeeCRUDServiceInterface.deleteEmployee(employeeId);

		if (result) {
			System.out.println("Employee deleted successfully");
		} else {
			System.out.println("Failed to delete ");
		}

		System.out.println("----------------------------");
		List<Employee> allEmployees = employeeCRUDServiceInterface.getAllEmployees();
		for (Employee e : allEmployees) {
			System.out.println(e);
		}
		System.out.println("----------------------------");
	}

}
