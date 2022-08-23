package com.employeewagecompute20220823;

import com.employeewagecompute20220823.Employee;

public class EmployeeWageCompute20220823 {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Employee employee = new Employee();
		System.out.println("Employee wage is "+employee.dailyWage(employee.attendance()));
	}

}
