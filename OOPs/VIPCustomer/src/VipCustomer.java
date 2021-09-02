package com.Hitesh;

public class VipCustomer {
    public String name;
    public int credit_limit;
    public String email;

       public String getName() {
        return name;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }

    public VipCustomer(String name, int credit_limit) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = "Default Email";
        System.out.println("Two Parameter Constructor");
    }

    public VipCustomer() {
        this.name = "name";
        this.credit_limit = 0000;
        this.email = "Default Email";
        System.out.println("No parameter Constructor Called");
    }

    public VipCustomer(String name, int credit_limit, String email) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
        System.out.println("Three parameter Constructor");
    }
}
