package com.qa.helloworld;

public class UniqueSum {

	public static void main(String[] args) {
		uniqueSum(2, 3, 3);
	}

	public static void uniqueSum(int x, int y, int z) {
		int a = x;
		int b = y;
		int c = z;

		if (x == y) {
			a = 0;
			b = 0;
		}

		if (y == z) {
			b = 0;
			c = 0;
		}

		if (x == z) {
			a = 0;
			c = 0;
		}

		System.out.println(a + b + c);
	}

}