package com.ocp14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("國", 100);
        map.put("英", 90);
        map.put("數", 100);
        System.out.println(map);
        System.out.println(map.get("英"));
        System.out.println(map.keySet()); // 取出所有的 key
        System.out.println(map.values()); // 取出所有的 value
        for(String key : map.keySet()) {
            System.out.println(key + " 分數:" + map.get(key));
        }
        // Java 8
        map.entrySet().forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));
        // 計算總分
        int sum = map.entrySet().stream().mapToInt(e -> e.getValue()).sum();
        System.out.println(sum);
    }
}
