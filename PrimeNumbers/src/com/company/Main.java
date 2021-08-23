package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
	for(int i = 5; i < 100;i++){
	    if(isPrime(i))
	        count ++;

    }
        if(count > 5)
            System.out.println("Prime Numbers are more than 5 = " + count);
    }
    public static boolean isPrime(int n){
        if(n==1)
            return false;
        for(int i = 2;i<=n/2;i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }
}
