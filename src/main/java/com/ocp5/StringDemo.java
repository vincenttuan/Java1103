package com.ocp5;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("Java"); // 一般 String 建立
        String s2 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2)); // 有分大小寫
        System.out.println(s1.equalsIgnoreCase(s2)); // 不分大小寫
        String s3 = "Java";
        String s4 = "Java";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4)); // 有分大小寫
        System.out.println(s3.equalsIgnoreCase(s4)); // 不分大小寫
    }
}
