package com.employeewagecompute20220823;

public class Employee {
	static public final int IS_PRESENT = 1;
	static public float WAGE_PER_HOUR = 20;
	static public float FULL_DAY_HOUR = 8;
	
	public int attendance () {
		return (int) Math.floor(Math.random() * 10) % 2;
	}
	
	public float dailyWage (int attendance) {
		if (attendance == IS_PRESENT) {
			return Math.round((float) WAGE_PER_HOUR * FULL_DAY_HOUR * 100) / 100;
		} else {
			return (float) 0.00;
		}
	}
}
