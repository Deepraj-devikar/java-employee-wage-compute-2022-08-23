package com.employeewagecompute20220823;

import com.employeewagecompute20220823.Employee;

public class EmployeeWageCompute20220823 {
	static final int IS_PRESENT = 1;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Employee employee = new Employee();
		if (IS_PRESENT == employee.attendance()) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}

}
