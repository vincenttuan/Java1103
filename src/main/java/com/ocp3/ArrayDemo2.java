package com.ocp3;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] score = new int[3];
        score[0] = 100;
        score[1] = 90;
        score[2] = 80;
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }
}
