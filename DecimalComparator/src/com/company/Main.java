package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(Math.round(3.1756*1000));
//        System.out.println(Math.round(3.176*1000));
//        System.out.println(Math.round(3.175*1000));

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        double roundNum1  = Math.round(num1*1000)/1000d;
        double roundNum2  = Math.round(num2*1000)/1000d;
        if(roundNum1 == roundNum2)
            return true;

        return false;


    }
}
