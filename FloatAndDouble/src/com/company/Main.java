package com.company;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5/3;
        //float myFloatValue = 5.25;  //5.25는 에러남
        //float myFloatValue = (float) 5.25; // 권장하지 않음
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5.00/3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double poundValue = 200d;
        double poundEqualTo = 0.45359237d;
        double result = poundValue * poundEqualTo;
        System.out.println("Result = " + result);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
