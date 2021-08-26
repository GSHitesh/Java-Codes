package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year of birth");

        boolean hasNextInt = sc.hasNextInt(); // Check if the next input value is an integer or not

        if(hasNextInt){
            int yearofBirth = sc.nextInt();
            sc.nextLine(); // Handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            int age = 2021 - yearofBirth;

            if(yearofBirth > 0){
                System.out.println("Your name is: " + name + " and your age is: " + age);
                sc.close();
            }
            else
                System.out.println("Invalid year of birth");
        } else{
            System.out.println("Unable to parse year of birth");
        }

    }
}
