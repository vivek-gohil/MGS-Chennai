package com.mindgate.util;

import com.mindgate.pojo.Employee;

public class EmployeeUtil {
	public double calculateYearlySalary(Employee employee) {
		double yearlySalary = 0;
		yearlySalary = employee.getSalary() * 12;
		return yearlySalary;
	}

	public double calculateAppraisal(Employee employee) {
		double appraisalAmount = 0;

		if (employee.getSalary() <= 25000) {
			appraisalAmount = (employee.getSalary() * 0.3) + employee.getSalary();
		}

		if (employee.getSalary() > 25000 && employee.getSalary() <= 50000) {
			appraisalAmount =  (employee.getSalary() * 0.2) + employee.getSalary();
		}

		return appraisalAmount;
	}
}
