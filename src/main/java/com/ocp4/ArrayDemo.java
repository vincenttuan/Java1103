package com.ocp4;

/*
    調查五位學生之身高及體重如下。
    身高：172、168、164、170、176(公分)
    體重：62、57、58、64、64(公斤)
*/
public class ArrayDemo {
    public static void main(String[] args) {
        double[] height = {172, 168, 164, 170, 176};
        double[] weight = {62, 57, 58, 64, 64};
        // 算出身高總和
        double h_sum = getSum(height);
        // 算出體重總和
        double w_sum = getSum(weight);
        System.out.printf("%.1f, %.1f\n", h_sum, w_sum);
        // 算出身高平均
        double h_avg = getAvg(height);
        // 算出體重平均
        double w_avg = getAvg(weight);
        System.out.printf("%.1f, %.1f\n", h_avg, w_avg);
    }
    
    public static double getSum(double[] array) {
        double sum = 0;
        for(int i=0;i<array.length;i++) {
            sum += array[i];
        }
        return sum;
    }
    
    public static double getAvg(double[] array) {
        double sum = getSum(array);
        return sum / array.length;
    }
}
