package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("The interest rate at " +i+"% is: " + CalculateInterest(10000.0 ,i));

        }
    }


    public static double CalculateInterest(double amount, double rate){
        return (amount * (rate/100.0));

    }
}
