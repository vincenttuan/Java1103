package com.ocp11.case7_equals;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
        Ball b1 = new Ball(100, "Red");
        Ball b2 = new Ball(100, "Red");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
        
    }
}
