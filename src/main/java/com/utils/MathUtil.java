package com.utils;

public class MathUtil {
    public static double sum(double[] values) {
        int sum = 0;
        for(int i=0;i<values.length;i++) {
            sum += values[i];
        }
        //for(int i=0;i<values.length;sum += values[i++]);
        return sum;
    }
    public static double avg(double[] values) {
        return sum(values)/values.length;
    }
}
