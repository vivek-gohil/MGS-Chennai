package com.mindgate.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mindgate.pojo.Employee;
import com.mindgate.util.EmployeeUtil;

public class EmployeeTest {
	private EmployeeUtil employeeUtil = new EmployeeUtil();
	Employee employee = new Employee("Aravind", 25000, 23);

	@Test
	public void testYearlySalary() {
		double yearlySalary = employeeUtil.calculateYearlySalary(employee);
		assertEquals(yearlySalary, 300000, 0.0);
	}

	@Test
	public void testAppraisal() {
		double appraisalAmount = employeeUtil.calculateAppraisal(employee);
		System.out.println(appraisalAmount);
		assertEquals(appraisalAmount, 32500, 0.0);
	}

}
