package com.qa.helloworld;

public class IterationsFlowcharts {

	public static void main(String[] args) {
		numNum(10);
	}

	public static void flowChart1() {

		for (int a = 100; a <= 200; a++) {
			System.out.println(a);
		}

	}

	public static void flowChart2() {

		for (int a = 100; a <= 200; a++) {
			System.out.println(a);
			if (a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}

	public static void numNum(int maxNumber) {
		
		for (int i = 0; i <= maxNumber ; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		

	}
}
