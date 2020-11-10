package com.ocp3;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] score = new int[3]; // 有3科考試成績
        score[0] = 100; // 國
        score[1] = 90;  // 英
        score[2] = 80;  // 數
        int len = score.length; // score 陣列資料長度
        System.out.println(len);
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
    }
}
