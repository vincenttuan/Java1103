package com.ocp15;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// 群組 GroupBy, 數量 Count, 排序 Sort
public class GroupByDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "apple", "banana",
                                           "apple", "banana", "watermelon", "orange");
        Map<String, Long> result = fruits.stream()
                                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
