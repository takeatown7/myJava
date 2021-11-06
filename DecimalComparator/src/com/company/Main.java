package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean answer = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        if (answer){
            System.out.println("true");
        }
        else System.out.println("false");
    }

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2){
        int intnum1 = (int)(num1 * 1000);
        int intnum2 = (int)(num2 * 1000);

        if (intnum1==intnum2){
            return true;
        }
        else return false;
    }
}
