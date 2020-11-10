package com.ocp3;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] score = {10, 9, 8};
        score = new int[]{100, 90, 80};
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }
}
