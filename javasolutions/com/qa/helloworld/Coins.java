package com.qa.helloworld;

public class Coins {

	public static void main(String []args){
        changeGiven(4.76, 20);
    }
    
    public static void changeGiven(double inAmount, double inCost) {
        int amount = (int)Math.round(inAmount*100);
        int cost = (int)Math.round(inCost*100);
        int change = cost - amount;
        int n_50 = 0, n_20 = 0, n_10 = 0, n_5 = 0, 
        c_200 = 0, c_100 = 0, c_50 = 0, c_20 = 0, 
        c_10 = 0, c_5 = 0, c_2 = 0, c_1 = 0;
      
        while(change % 5000 != change) {
            change -= 5000;
            n_50 += 1;
            System.out.println("£50 notes: " + n_50);
        }
        while(change % 2000 != change) {
            change -= 2000;
            n_20 += 1;
            System.out.println("£20 notes: " + n_20);
        }
        while(change % 1000 != change) {
            change -= 1000;
            n_10 += 1;
            System.out.println("£10 notes: " + n_10);
        }
        while(change % 500 != change) {
            change -= 500;
            n_5 += 1;
            System.out.println("£5 notes: " + n_5);
        }
        while(change % 200 != change) {
            change -= 200;
            c_200 += 1;
            System.out.println("£2 coins: " + c_200);
        }
        while(change % 100 != change) {
            change -= 100;
            c_100 += 1;
            System.out.println("£1 coins: " + c_100);
        }
        while(change % 50 != change) {
            change -= 50;
            c_50 += 1;
            System.out.println("50p coins: " + c_50);
        }
        while(change % 20 != change) {
            change -= 20;
            c_20 += 1;
            System.out.println("20p coins: " + c_20);
        }
        while(change % 10 != change) {
            change -= 10;
            c_10 += 1;
            System.out.println("10p coins: " + c_10);
        }
        while(change % 5 != change) {
            change -= 5;
            c_5 += 1;
            System.out.println("5p coins: " + c_5);
        }
        while(change % 2 != change) {
            change -= 2;
            c_2 += 1;
            System.out.println("2p coins: " + c_2);
        }
        while(change % 1 != change) {
            change -= 1;
            c_1 += 1;
            System.out.println("1p coins: " + c_1);
        }
    }
}