package com.qa.helloworld;

public class Arrays {

	public static void main(String[] args) {
		numArray();
	}

	public static void numArray() {
		int[] numbers = new int[10];

		for (int i = 0; i < 10; i++) {
			numbers[i] = i;

			System.out.println(numbers[i]);
		}
		
			System.out.println("-----------------------------------");

		for (int i = 0; i < 10; i++) {
			numbers[i] = numbers[i] * 10;

			System.out.println(numbers[i]);
		}
	}
}