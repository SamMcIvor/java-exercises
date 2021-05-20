package com.qa.helloworld;

public class BlackJack {

	public static void main(String[] args) {
		blackJack();
	}

	public static void blackJack() {
		int play1 = 13;
		int play2 = 21;

		if (play1 >= play2 & play1 <= 21) {
			System.out.println(play1);
		} else if (play1 < play2 & play2 <= 21) {
			System.out.println(play2);
		} else if (play1 > 21 & play2 > 21) {
			System.out.println(0);
		} else if (play1 > 21) {
			System.out.println(play2);
		} else if (play2 > 21) {
			System.out.println(play1);
		}
	}
}
