package com.employeewagecompute20220823;

import com.employeewagecompute20220823.Employee;

public class EmployeeWageCompute20220823 {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Employee employee = new Employee();
		int attendance = employee.attendance();
		if (employee.IS_PRESENT == attendance) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
		System.out.println("Employee wage is "+employee.dailyWage(attendance));
	}

}
