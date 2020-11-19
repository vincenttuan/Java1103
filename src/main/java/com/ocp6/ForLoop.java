package com.ocp6;

public class ForLoop {
    public static void main(String[] args) {
        int[] scores = {100, 90, 80};
        // Standard for-loop
        for(int i=0;i<scores.length;i++) {
            System.out.println(scores[i]);
        }
        // Enhanced for-loop
        // 只能往下讀取
        // 無法改變內容
        for(int s :scores) {
            System.out.println(s);
        }
    }
}
