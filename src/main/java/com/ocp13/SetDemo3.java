package com.ocp13;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        // 集合與泛型<>
        Set set = new LinkedHashSet();
        while(set.size() < 5) {
            set.add(new Random().nextInt(39) + 1);
        }
        set.add("雜質");
        System.out.println(set);
        set.remove("雜質");
        System.out.println(set);
        System.out.println("-----------------------------------------");
        Set<Integer> set2 = new LinkedHashSet<>();
        while(set2.size() < 5) {
            set2.add(new Random().nextInt(39) + 1);
        }
        System.out.println(set2);
        // e -> e.intValue() Integer e 調用 e.intValue() 轉成 int
        //set2.stream().mapToInt(e -> e.intValue()).sum();
        int sum = set2.stream().mapToInt(e -> e).sum();
        System.out.println(sum);
    }
}
