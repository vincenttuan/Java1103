package com.ocp2;

// 帳戶
public class Account {
    String name; // 戶名
    private int balance; // 餘額
    
    // 存款
    void setBalance(int money) {
        if(money >= 0) {
            balance += money;
        }
    }
    
    // 印出帳戶餘額 
    void printBalance() {
        System.out.printf("name: %s, balance: %,d\n", name, balance);
    }
}
