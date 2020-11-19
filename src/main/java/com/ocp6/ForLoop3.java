package com.ocp6;

public class ForLoop3 {
    public static void main(String[] args) {
        int[][][] nums = {
            {{100, 90}, {80, 70}, {60, 50}},
            {{70, 90}, {80, 100}, {90, 90}},
        };
        // 求所有數字的總和 ?
        int sum = 0;
        for (int[][] num : nums) {
            for (int[] nu : num) {
                for (int n : nu) {
                    System.out.println(n);
                    sum += n;
                }
            }
        }
        System.out.printf("sum= %d\n", sum);
    }
}
