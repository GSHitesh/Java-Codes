package com.Hitesh;

import com.Hitesh.VipCustomer;

public class Main {

    public static void main(String[] args) {
        VipCustomer customer1 =  new VipCustomer();
        VipCustomer customer2 = new VipCustomer("Hitesh",1000);
        VipCustomer customer3 = new VipCustomer("Hitesh Gorantla",2000,
                "hitesh@gmail.com");

    }
}