package com.service;

import com.controller.EmployeeCompute;

public class EmployeeComputeService 
{
	
	public EmployeeCompute EmployeeComputeServicesalary(EmployeeCompute e)
	{
		double perannumsalary=0;
		perannumsalary=e.getSalaryPerMonth()*12;
		e.setSalaryPerMonth(perannumsalary);
		return e;
	}
	 public EmployeeCompute computeIncrement(EmployeeCompute e) {
	        String city = e.getCity();
	        double increment = 0;

	        if (city.equals("Mumbai")) {
	            increment = 0.05 * e.getSalaryPerMonth();
	        } else if (city.equals("Pune"))
	        {
	            increment = 0.03 * e.getSalaryPerMonth();
	        }
	        double newSalary = e.getSalaryPerMonth() + increment;
	        e.setSalaryPerMonth(newSalary);
			return e;
	 }
	public double totalSalary(EmployeeCompute[] e)
	{
	
		double totalsalary=0.0;
		for(int i=0;i<e.length;i++)
		{
			totalsalary+=e.length;
		}
		return totalsalary;
		
	}
}
