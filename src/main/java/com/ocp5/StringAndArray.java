package com.ocp5;

import java.util.Arrays;

public class StringAndArray {
    public static void main(String[] args) {
        String id = "A133334444";
        System.out.println(id.length());
        char city = id.charAt(0);
        char sex = id.charAt(1);
        System.out.println(city);
        System.out.println(sex);
        char[] cs = id.toCharArray();
        System.out.println(Arrays.toString(cs)); // 將 cs 資料印出
    }
}
