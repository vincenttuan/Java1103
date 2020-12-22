package com.ocp13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
    public static void main(String[] args) {
        Set set = new TreeSet(); //LinkedHashSet(); // HashSet();
        // 今彩539, 1~39中取5個不重複的數字
        // 電腦選號
        while (set.size() < 5) {            
            // 產生一個 1~39 的隨機數
            int n = new Random().nextInt(39)+1;
            set.add(n);
            System.out.println("加入 ==> " + n);
        }
        System.out.println(set);
    }
}
