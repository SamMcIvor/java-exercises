package com.qa.helloworld;

public class IterationNumbers {
    
    private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
            " seventy", " eighty", " ninety" };
    private static final String[] numNames = { "", " one", " two", " three", " four", " five", " six", " seven",
            " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
            " seventeen", " eighteen", " nineteen" };
            
    public static void main(String args[]) {
        iterationNumbersMethod1(15);
        iterationNumbersMethod2(1552);
    }
    
    public static void iterationNumbersMethod1(int num1) {
        int numOne = num1 % 10;
        int numTen = (num1 - (num1 % 10)) / 10;
        System.out.println(numOne + numTen);
    }
    
    public static void iterationNumbersMethod2(int num2) {
        int numOne = num2 % 10;
        int numTen;
        int numHundred;
        int numThousand = 0;
        int teenCheck = num2 % 100;
        if (num2 < 1000) {
            if (num2 < 100) {
                numTen = (num2 - (num2 % 10)) / 10;
                numHundred = 0;
            } else {
                numTen = (num2 - (num2 % 10)) / 10;
                numHundred = numTen;
                numTen = numTen % 10;
                numHundred = (numHundred - (numHundred % 10)) / 10;
            }
        } else {
            numTen = (num2 - (num2 % 10)) / 10;
            numHundred = numTen;
            numTen = numTen % 10;
            numHundred = (numHundred - (numHundred % 10)) / 10;
            numThousand = numHundred;
            numHundred = numHundred % 10;
            numThousand = (numThousand - (numThousand % 10)) / 10;
        }
        int numCount = 0;
        int tenCount = 0;
        int hundredCount = 0;
        int thousandCount = 0;
        boolean correctNum = true;
        boolean correctTen = true;
        boolean correctHundred = true;
        boolean correctThousand = true;
        while (correctNum) {
            numCount++;
            if (numCount >= numOne) {
                correctNum = false;
            }
        }
        while (correctTen) {
            tenCount++;
            if (tenCount >= numTen) {
                correctTen = false;
            }
        }
        while (correctHundred) {
            hundredCount++;
            if (hundredCount >= numHundred) {
                correctHundred = false;
            }
        }
        while (correctThousand) {
            thousandCount++;
            if (thousandCount >= numThousand) {
                correctThousand = false;
            }
        }
        if (num2 < 1000) {
            if (num2 < 100) {
                if (num2 < 10) {
                    System.out.println(tensNames[tenCount] + numNames[numCount]);
                } else {
                    System.out.println(numNames[num2]);
                }
            } else {
                if (teenCheck < 20) {
                    System.out.println(numNames[numHundred] + " hundred and" + numNames[teenCheck]);
                } else {
                    System.out
                            .println(numNames[numHundred] + " hundred and" + tensNames[tenCount] + numNames[numCount]);
                }
            }
        } else {
            if (teenCheck < 20) {
                System.out.println(numNames[numThousand] + " thousand" + numNames[numHundred] + " hundred and"
                        + numNames[teenCheck]);
            } else {
                System.out.println(numNames[numThousand] + " thousand" + numNames[numHundred] + " hundred and"
                        + tensNames[tenCount] + numNames[numCount]);
            }
        }
    }
}