package com.utils;

public class MathUtil {
    // 總和
    public static double sum(double[] values) {
        int sum = 0;
        for(int i=0;i<values.length;i++) {
            sum += values[i];
        }
        //for(int i=0;i<values.length;sum += values[i++]);
        return sum;
    }
    
    // 平均
    public static double avg(double[] values) {
        return sum(values)/values.length;
    }
    
    // 標準差
    public static double sd(double [] values) {
        double avg = avg(values);
        double diff_sum = 0;
        for (int i = 0; i < values.length; i++) {
            diff_sum += Math.pow(values[i] - avg, 2);
        }
        double sd = Math.sqrt((1.0/values.length) * diff_sum);
        return sd;
    }
    
    // 變異係數
    public static double cv(double sd, double avg) {
        return sd / avg;
    }
    
    // 變異係數
    public static double cv(double [] values) {
        double sd = sd(values);
        double avg = avg(values);
        double cv = sd / avg;
        return cv;
    }
    
    // 取得最大值
    public static double max(double [] values) {
        double max = 0;
        for(int i=0;i<values.length;i++) {
            if(values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }
    
    // 取得最小值
    public static double min(double [] values) {
        double min = Integer.MAX_VALUE;
        for(int i=0;i<values.length;i++) {
            if(values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }
}
