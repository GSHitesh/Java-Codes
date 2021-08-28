package com.Hitesh;

import java.net.SocketTimeoutException;

public class Main {

    public static void main(String[] args) {
     

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
