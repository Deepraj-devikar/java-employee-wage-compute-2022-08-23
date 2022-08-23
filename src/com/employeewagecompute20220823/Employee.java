package com.employeewagecompute20220823;

public class Employee {
	static public final int IS_PRESENT = 1;
	static public final int IS_PART_TIME = 2;
	static public float WAGE_PER_HOUR = 20;
	static public float FULL_DAY_HOUR = 8;
	static public float PART_TIME_HOUR = 4;
	static public int MONTHLY_WORKING_DAYS = 20;
	
	static public int day = 0;
	static public float monthlyWage = 0;
	
	public int attendance () {
		int result = (int) Math.floor(Math.random() * 10) % 3;
		switch (result) {
		case IS_PRESENT:
			System.out.println("Employee is present");
			break;
		case IS_PART_TIME:
			System.out.println("Employee is part time");
			break;
		default:
			System.out.println("Employee is absent");
			break;
		}
		return result;
	}
	
	public float dailyWage() {
		switch (this.attendance()) {
		case IS_PRESENT:
			return Math.round((float) WAGE_PER_HOUR * FULL_DAY_HOUR * 100) / 100;
		case IS_PART_TIME:
			return Math.round((float) WAGE_PER_HOUR * PART_TIME_HOUR * 100) / 100;
		default:
			return (float) 0.00;
		}
	}
	
	public float monthlyWage() {
		while (this.day < MONTHLY_WORKING_DAYS) {
			this.day++;
			this.monthlyWage += dailyWage();
		}
		return this.monthlyWage; 
	}
}
