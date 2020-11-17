/*
第一次月考，甲、乙兩班數學的平均成績分別為 80 分、70 分，標準差
分別為 9 分，8 分，試問那一班的同學之程度比較平均？ 
*/
package com.ocp5;
import static com.utils.MathUtil.cv;
public class MultiArray3 {
    public static void main(String[] args) {
        String clazz = cv(9, 80) < cv(8, 70) ? "甲班" : "乙班";
        System.out.println(clazz);
    }
}
