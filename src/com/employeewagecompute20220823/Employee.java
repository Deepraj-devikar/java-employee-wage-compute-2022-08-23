package com.employeewagecompute20220823;

public class Employee {
	static public final int IS_PRESENT = 1;
	static public final int IS_PART_TIME = 2;
	static public float WAGE_PER_HOUR = 20;
	static public float FULL_DAY_HOUR = 8;
	static public float PART_TIME_HOUR = 4;
	
	public int attendance () {
		return (int) Math.floor(Math.random() * 10) % 3;
	}
	
	public float dailyWage (int attendance) {
		if (attendance == IS_PRESENT) {
			return Math.round((float) WAGE_PER_HOUR * FULL_DAY_HOUR * 100) / 100;
		} else if (attendance == IS_PART_TIME) {
			return Math.round((float) WAGE_PER_HOUR * PART_TIME_HOUR * 100) / 100;
		} else {
			return (float) 0.00;
		}
	}
}
