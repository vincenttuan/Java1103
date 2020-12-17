package com.ocp12.stream1;

import java.util.stream.Stream;

public class StringStream3 {
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "C", "Visual Basic"};
        // 印出每個字串長度的總和
        // {4, 6, 1, 12} = 23
        int sum = Stream.of(names).mapToInt(x -> x.length()).sum();
        System.out.println(sum);
        
    }
}
