package com.qa.helloworld;

public class Numbers {

	public static void main(String[] args) {
		digitAdd();

	}

	public static void digitAdd() {
		int num = 41;
		int sum = 0;
		{
			while (num > 0) {
				sum = sum + num % 10;
				num = num / 10;
			}
			System.out.println(sum);
		}
	}
}
