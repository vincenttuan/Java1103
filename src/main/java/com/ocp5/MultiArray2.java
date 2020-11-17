package com.ocp5;

import com.utils.MathUtil;
import java.util.Arrays;

/*
某公司有19位員工，其中10位在去年投資股票，一年的獲
利率如下(單位：%)：
7.6 3.9 15.6 28.3 1.2 10.8 35.3 45.6 10.2 0.5
另外9位員工投資買公債一年內獲利率如下(單位：%)
6.8 7.2 6.8 7.5 6.9 7.9 7.9 7.1 7.2
試分別求此公司的員工投資股票與公債的個別平均獲利率
試分別求此公司的員工投資股票與公債的獲利率變異係數。
*/
public class MultiArray2 {
    public static void main(String[] args) {
        double[][] profit = {
            {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5},
            {6.8, 7.2, 6.8,  7.5,  6.9, 7.9,  7.9,  7.1,  7.2},
        };
        for(int i=0;i<profit.length;i++) {
            System.out.printf("%s 平均: %.1f\n", Arrays.toString(profit[i]), MathUtil.avg(profit[i]));
        }
    }
    
    
}
