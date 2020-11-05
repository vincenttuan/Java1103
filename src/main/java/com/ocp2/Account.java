package com.ocp2;

// 帳戶
public class Account {
    String name; // 戶名
    int balance; // 餘額
    
    // 印出帳戶餘額 
    void printBalance() {
        System.out.printf("name: %s, balance: %,d\n", name, balance);
    }
}
