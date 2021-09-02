package com.Hitesh;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		BankAccount Account1 = new BankAccount();
		//BankAccount Account1 = new BankAccount("ABC123456", 45824.0, "Hitesh Gorantla", "saihitesh01@gmail.com",7732943807.0);

		System.out.println("Account Number: " + Account1.getAccountNumber());
		System.out.println("Account Balance: " + Account1.getBalance());
		System.out.println("Customer Name: " + Account1.getCustomerName());
		System.out.println("Customer Email: " + Account1.getEmail());
		System.out.println("Customer Ph Number: " + Account1.getPhoneNumber());

		Account1.DepositFunds(2000.00);
		Account1.WithdrawFunds(1000.00);

		System.out.println("Account Number: " + Account1.getAccountNumber());
		System.out.println("Account Balance: " + Account1.getBalance());
		System.out.println("Customer Name: " + Account1.getCustomerName());
		System.out.println("Customer Email: " + Account1.getEmail());
		System.out.println("Customer Ph Number: " + Account1.getPhoneNumber());


    }
}
