package com.ocp16;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        play();
    }
    public static void play() {
        int x = 10;
        Scanner sc = new Scanner(System.in);
        System.out.print("假設分子(x)是 10 請輸入分母(y): ");
        int y = sc.nextInt();
        int result = x / y;
        System.out.println(result);
    }
}
