package com.ocp12.lambda4;

public class Main { 
    public static void main(String[] args) {
        Print print1 = (x) -> System.out.println(x);
        Print print2 = System.out::println;
        
        print1.display(100);
        print2.display(100);
    }
}
