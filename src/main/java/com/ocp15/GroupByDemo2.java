package com.ocp15;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo2 {
    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("apple"     , 10, 10),
                new Fruit("orange"    , 15, 15),
                new Fruit("apple"     , 20, 10),
                new Fruit("banana"    , 10, 15),
                new Fruit("watermelon", 10, 20),
                new Fruit("papaya"    , 15, 15),
                new Fruit("papaya"    , 20, 15),
                new Fruit("apple"     , 20, 10)
        );
        // 每一種水果有幾組 ?
        Map<String, Long> counting = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getName, Collectors.counting()));
        System.out.println(counting);
    }
}
