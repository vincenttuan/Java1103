package com.ocp4;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 骰子
        int[] dice = {1, 2, 3, 4, 5, 6};
        // 擲一顆骰子得分數
        int score = getScore(dice);
        System.out.println(score);
        // 擲三顆骰子得總分數
        int[] scores = new int[3];
        for(int i=0;i<scores.length;i++) {
            scores[i] = getScore(dice);
        }
        System.out.println(Arrays.toString(scores));
        // 計算總分
        int sum = getSum(scores);
        System.out.println(sum);
    }
    
    public static int getSum(int [] scores) {
        int sum = 0;
        for(int i=0;i<scores.length;i++) {
            sum += scores[i];
        }
        return sum;
    }
    
    public static int getScore(int[] dice) {
        Random r = new Random();
        int index = r.nextInt(dice.length);
        int score = dice[index];
        return score;
    }
}
