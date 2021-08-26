package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int sum = 0;

        while(num <= 10){
            System.out.println("Enter the number #" + num + " : ");
            boolean checkInt = sc.hasNextInt();
            if(checkInt){
                int number = sc.nextInt();
                sum += number;

            }else {
                System.out.println("Invalid Number");

            }
            num++;
            sc.nextLine(); // handle end of line (enter key)
        }
        System.out.println("The sum of ten numbers is: " + sum);
        sc.close();

    }
}
