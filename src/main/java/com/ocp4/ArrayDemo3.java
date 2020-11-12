package com.ocp4;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] nums = new int[4];
        for(int i=0;i<nums.length;) {
            int n = r.nextInt(9) + 1;
            if(!isExist(nums, n)) {
                nums[i] = n;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    
    public static boolean isExist(int[] nums, int n) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == n) {
                return true;
            }
        }
        return false;
    }
}
