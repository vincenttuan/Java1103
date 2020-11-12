package com.ocp4;

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
        
    }
    
    public static int getScore(int[] dice) {
        Random r = new Random();
        int index = r.nextInt(dice.length);
        int score = dice[index];
        return score;
    }
}
