package com.ocp5;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        s1 = s1.concat("8");
        System.out.println(s1);
        StringBuilder sb = new StringBuilder("Java");
        sb.append("8");
        System.out.println(sb); // sb.toString()
        // 如何比較 s1 與 sb ??
        System.out.println(s1.equals(sb));
        System.out.println(s1.equals(sb.toString()));
        System.out.println(s1.intern() == sb.toString().intern());
    }
}
