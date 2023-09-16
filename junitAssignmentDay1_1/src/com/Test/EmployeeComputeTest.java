package com.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.controller.EmployeeCompute;

import com.service.EmployeeComputeService;

public class EmployeeComputeTest
{
	@Test
	public void testComputePerAnnumSalary() {
        EmployeeCompute e = new EmployeeCompute(1, "John", "john@example.com", "1234567890", "Mumbai", 50000);
        EmployeeComputeService employeeService = new EmployeeComputeService();
        EmployeeCompute updatedStudent = employeeService.EmployeeComputeServicesalary(e);
        assertEquals(600000, updatedStudent.getSalaryPerMonth(), 0.01);
    }
	public void testComputeIncrementMumbai() {
		EmployeeCompute e = new EmployeeCompute(2, "Alice", "alice@example.com", "9876543210", "Mumbai", 60000);
		EmployeeComputeService employeeService = new EmployeeComputeService();
		EmployeeCompute updatedStudent = employeeService.computeIncrement(e);
        assertEquals(63000, updatedStudent.getSalaryPerMonth(), 0.01);
    }
	 @Test
	    public void testComputeIncrementPune() {
		 EmployeeCompute e = new EmployeeCompute(3, "Bob", "bob@example.com", "2345678901", "Pune", 50000);
		 EmployeeComputeService employeeService = new EmployeeComputeService();
	        EmployeeCompute updatedStudent = employeeService.computeIncrement(e);
	        assertEquals(51500, updatedStudent.getSalaryPerMonth(), 0.01);
	    }
	 @Test
	    public void testComputeTotalSalary() {
		 EmployeeCompute[] e = {
	            new EmployeeCompute(1, "John", "john@example.com", "1234567890", "Mumbai", 50000),
	            new EmployeeCompute(2, "Alice", "alice@example.com", "9876543210", "Mumbai", 60000),
	            new EmployeeCompute(3, "Bob", "bob@example.com", "2345678901", "Pune", 50000)
	        };
		 EmployeeComputeService employeeService = new EmployeeComputeService();
	        double totalSalary = employeeService.totalSalary(e);
	        assertEquals(160000, totalSalary, 0.01);
	    }
}
