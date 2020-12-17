package com.ocp12.stream1;

import java.util.stream.IntStream;

public class IntStreamDemo {
    public static void main(String[] args) {
        int[] nums = {100, 50, 70, 30};
        // 印出及格的分數的總和
        // Before Java 8
        int sum = 0;
        for(int x : nums) {
            if(x >= 60) {
                sum += x;
            }
        }
        System.out.println(sum);
        // Java 8
        int sum2 = IntStream.of(nums).filter(x -> x >=60).sum();
        System.out.println(sum2);
    }
}
