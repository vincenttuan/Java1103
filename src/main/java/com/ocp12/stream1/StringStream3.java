package com.ocp12.stream1;

import java.util.stream.Stream;

public class StringStream3 {
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "C", "Visual Basic"};
        // 印出每個字串長度的總和
        // {4, 6, 1, 12} = 23
        int sum = Stream.of(names).mapToInt(x -> x.length()).sum();
        System.out.println(sum);
        // 印出字串長度 <= 4 的長度各是多少 ?
        Stream.of(names)                   // {"Java", "Python", "C", "Visual Basic"}
                .mapToInt(x -> x.length()) // {4, 6, 1, 12}
                .filter(x -> x <= 4)       // {4, 1}
                .forEach(x -> System.out.println(x));
        
        Stream.of(names)                    // {"Java", "Python", "C", "Visual Basic"}
                .mapToInt(String::length)   // {4, 6, 1, 12}
                .filter(Util::isLessThan4)  // {4, 1}
                .forEach(System.out::println);
    }
}
