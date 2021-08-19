package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isTeen(10));
        System.out.println(isTeen(-10));
        System.out.println(isTeen(25));
        System.out.println("Three Parameter Inputs");
        System.out.println(hasTeen(12,34,2));
        System.out.println(hasTeen(15,12,12));
    }
        public static boolean hasTeen(int age1, int age2, int age3){
        if(age1 >= 0 && age1 < 20 && age2 >= 0 && age2 < 20 && age3 >= 0 && age3 < 20)
            return true;

        return false;
    }
    public static boolean isTeen(int age){
        if(age >= 0 && age < 20)
            return true;

        return false;
    }
}
