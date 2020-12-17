package com.ocp12.stream1;

// 字串串流

import java.util.stream.Stream;

public class StringStream {
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "C", "Visual Basic"};
        // Before Java 8
        // for-loop 印出元素內容
        for(int i=0;i<names.length;i++) {
            System.out.println(names[i]);
        }
        // Java 8 使用 Stream
        // 陣列轉串流
        //Stream.of(names).forEach(x -> System.out.println(x));
        Stream.of(names).forEach(System.out::println);
    }
}
