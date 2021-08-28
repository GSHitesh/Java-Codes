package com.Hitesh;

public class BankAccount {
    private String AccountNumber;
    private double balance;
    private String CustomerName;
    private String Email;
    private  double PhoneNumber;

    public void setAccountNumber( String accountNumber) {
            this.AccountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.CustomerName = customerName;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return AccountNumber;

    }

    public double getBalance() {
        return balance;
    }

    public double getPhoneNumber() {
        return PhoneNumber;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return Email;
    }
    public BankAccount(){
        this("dfas23232",5454.00,"Default Name",
                "Default Email", 0);
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email,
                       double phoneNumber) {
        this.AccountNumber = accountNumber;
        this.balance = balance;
        this.CustomerName = customerName;
        this.Email = email;
        this.PhoneNumber = phoneNumber;
    }

    public void DepositFunds(double amount){
        if(this.balance > amount){
            this.balance += amount;
            System.out.println("Amount deposited successfully");
        }else{
            System.out.println("Transaction Unsuccessful");
        }
    }

    public void WithdrawFunds(double amount){
        if(this.balance > amount){
            this.balance -= amount;
            System.out.println("Amount withdrawn successfully");

        }else{
            System.out.println("Transaction Failed");
        }
    }


}
