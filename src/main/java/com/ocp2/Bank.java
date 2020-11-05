package com.ocp2;

public class Bank {
    public static void main(String[] args) {
        Account ac1 = new Account();
        Account ac2 = new Account();
        ac1.name = "john";
        ac1.setBalance(10000);
        ac1.setBalance(5000);
        ac2.name = "mary";
        ac2.setBalance(10000);
        ac2.setBalance(3000);
        //System.out.printf("name: %s, balace: %,d\n", ac1.name, ac1.balance);
        //System.out.printf("name: %s, balace: %,d\n", ac2.name, ac2.balance);
        ac1.printBalance();
        ac2.printBalance();
    }
}
