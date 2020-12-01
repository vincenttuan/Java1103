package com.ocp9;

public class MultiAdd2 {
    public static void print(int x, int y) {
        System.out.println("A");
    }
    
    public static void print(int... nums) {
        System.out.println("B");
    }
    
    public static void main(String[] args) {
        print(1);
        print(1, 2);
        print(1, 2, 3);
    }
}
