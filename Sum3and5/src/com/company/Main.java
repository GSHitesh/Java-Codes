package com.company;

public class Main {

    public static void main(String[] args) {
        int sum =0, count = 0;
	for(int i =1; i<1000;i++){
	    if(i%15==0) {
            sum += i;
            count++;
            System.out.println("Number found at: " +i);
        }
	    if(count == 5)
	        break;
    }
        System.out.println("The sum of first five numbers: " + sum);
    }
}
