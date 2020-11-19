package com.ocp6;

import java.util.Arrays;

public class Mcdonalds {
    public static void main(String[] args) {
        Hamburger h = new Hamburger();
        h.setName("大麥克");
        h.setPrice(72);
        System.out.println(h);
        
        Hamburger h2 = new Hamburger("麥香魚", 60);
        System.out.println(h2);
        
        Hamburger[] hamburgers = {h, h2, h, h, h, h, h2, h2};
        // 求總金額
        int sum = 0;
        for(Hamburger hamburger : hamburgers) {
            sum += hamburger.getPrice();
        }
        System.out.printf("總金額 $%d\n", sum);
        System.out.printf("你買的有: %s\n", Arrays.toString(hamburgers));
    }   
}
