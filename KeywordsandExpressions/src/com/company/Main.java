package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println("THis is the one expression, " + "This is another ");

      calculateScore(250);

    }

    public static void calculateScore(int num) {
        //int num = 100;
        if(num <100)
            System.out.println("This num is less than 100");
        else if(num >= 100) {
            System.out.println("The num is equal to " + num);
            System.out.println("This is another sentence in the line");
        }

    }
}
