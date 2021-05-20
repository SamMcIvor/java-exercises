package com.qa.helloworld;

public class Tax {

	public static void main(String[] args) {
		System.out.println("Salary after taxes: " + salaryTax(23500));
		System.out.println("Tax from salary is: " + exactTax(23500));
	}

	public static double salaryTax(int salary) {

		if (salary <= 14999) {
			return salary;
		} else if (salary >= 15000 && salary <= 19999) {
			return salary * 0.9;
		} else if (salary >= 20000 && salary <= 29999) {
			return salary * 0.85;
		} else if (salary >= 30000 && salary <= 44999) {
			return salary * 0.8;
		} else {
			return salary * 0.75;
		}
	}

	public static double exactTax(int salary) {
	
		if (salary <= 14999) {
			return salary;
		} else if (salary >= 15000 && salary <= 19999) {
			return salary * 0.1;
		} else if (salary >= 20000 && salary <= 29999) {
			return salary * 0.15;
		} else if (salary >= 30000 && salary <= 44999) {
			return salary * 0.2;
		} else {
			return salary * 0.25;
		}
	}
}
