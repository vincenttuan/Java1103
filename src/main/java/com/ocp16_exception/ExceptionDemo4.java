package com.ocp16_exception;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        // foo(); // 必須使用 try-catch 或 throws 拋出
        // bar(); // 直接使用即可
    }
    
    public static void foo() throws Exception { // checked exception
        System.out.println("foo");
    }
    
    public static void bar() throws RuntimeException { // Unchecked exception
        System.out.println("bar");
    }
}
