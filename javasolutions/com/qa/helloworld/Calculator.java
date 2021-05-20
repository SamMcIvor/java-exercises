package com.qa.helloworld;

public class Calculator {

	public static void main(String[] args) {
		numbersAdd();
	}

	public static void numbersAdd() {
		int num1 = 3;
		int num2 = 4;
		int result = num1 + num2;
		System.out.println(result);

	}

	public static void numbersSub() {
		int num1 = 3;
		int num2 = 4;
		int result = num1 - num2;
		System.out.println(result);

	}

	public static void numbersMult() {
		int num1 = 3;
		int num2 = 4;
		int result = num1 * num2;
		System.out.println(result);

	}

	public static void numbersDiv() {
		double num1 = 2;
		double num2 = 6;
		double result = num1 / num2;
		if (num1 < num2) {
			System.out.println(result);
		} else {
			System.out.println("Cannot perform division");
		}
	}
}
