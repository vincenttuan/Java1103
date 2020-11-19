package com.ocp6;

public class Mcdonalds {
    public static void main(String[] args) {
        Hamburger h = new Hamburger();
        h.setName("大麥克");
        h.setPrice(72);
        //System.out.println(h.getName() + ", " + h.getPrice());
        System.out.println(h);
        //System.out.println(h.toString());
    }
}
