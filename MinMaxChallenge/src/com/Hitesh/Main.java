package com.Hitesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        //int min = Integer.MAX_VALUE;
        int max = 0;
//        int max  = Integer.MIN_VALUE;
        boolean first = true;
        while (true){
            System.out.println("Enter the numbers: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                if(first){
                    first = false;
                    min = number;
                    max = number;
                }
                if(number > max )
                    max = number;
                if (number < min)
                    min = number;

            }else {
                break;
            }
            scanner.nextLine();

        }
        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: "+ min);
        scanner.close();
    }
}
