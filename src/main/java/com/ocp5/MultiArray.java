package com.ocp5;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[][] scores = new int[2][3];
        System.out.println(scores.length);
        System.out.println(scores[0].length);
        System.out.println(scores[1].length);
        System.out.println(Arrays.toString(scores[0]));
        System.out.println(Arrays.toString(scores[1]));
        for(int i=0;i<scores.length;i++) {
            System.out.println(Arrays.toString(scores[i]));
        }
    }
}
