package com.company;

public class Main {

    public static void main(String[] args) {
        boolean answer = hasTeen(18,15,14);
        if (answer){
            System.out.println("true");
        }
        else System.out.println("false");
    }
    public static boolean hasTeen(int num1, int num2, int num3) {
        if ( isTeen(num1) || isTeen(num2) || isTeen(num3) ) {
            return true;
        }
        else return false;
    }

    public static boolean isTeen(int num1) {
        if (num1>=13 && num1<=19)
        {
            return true;
        }
        else return false;
    }
}

