package com.company;

public class Main {

    public static void main(String[] args) {

	char ch = 'z';
	switch (ch){
        case 'a':
            System.out.println("It's A");
            break;
        case 'b':
            System.out.println("It's b");
            break;
        case 'c': case'd': case'e':
            System.out.println("Either c ,d,or e");
            break;
        default:
            System.out.println("Not found");
    }
    }
}
