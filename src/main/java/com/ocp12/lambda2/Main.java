package com.ocp12.lambda2;

public class Main {
    public static void main(String[] args) {
        // Java 8
        Add add  = (x, y) -> x + y; // 加法邏輯
        Add add2 = (x, y) -> {return x * y;}; // 乘法邏輯
        
        System.out.println(add.sum(10, 20));
        System.out.println(add2.sum(10, 20));
        
        oneAdd(add);
        oneAdd(add2);
        oneAdd((x, y) -> x / y);
        oneAdd((x, y) -> x - y);
    }
    
    public static void oneAdd(Add a1) {
        System.out.println(a1.sum(10, 5));
    }
    
}
