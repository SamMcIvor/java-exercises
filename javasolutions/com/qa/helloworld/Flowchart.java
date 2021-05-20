package com.qa.helloworld;

public class Flowchart {

	public static void main(String[] args) {
		flowChart();
	}

	public static void flowChart() {
		int A = 3780;

		if (A > 2000)
			System.out.println("A");
		if (A > 2000 & A < 6000)
			System.out.println("B");
		if (A > 2000 & A > 6000)
			System.out.println("C");
		if (A > 2000 & A > 4000 & A < 6000)
			System.out.println("D");
		if (A > 2000 & A < 4000)
			System.out.println("E");
		if (A < 2000)
			System.out.println("1");
		if (A < 2000 & A < 100)
			System.out.println("2");
		if (A < 2000 & A > 100)
			System.out.println("3");
		if (A < 2000 & A > 600)
			System.out.println("5");
		if (A < 2000 & A > 100 & A < 600)
			System.out.println("4");
		if (A < 2000 & A > 500 & A < 600)
			System.out.println("6");
		if (A < 2000 & A > 100 & A < 500)
			System.out.println("7");

	}
}