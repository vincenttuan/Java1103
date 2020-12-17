package com.ocp12.lambda4;

import java.util.function.Consumer;

public class Main { 
    public static void main(String[] args) {
        Print print1 = (x) -> System.out.println(x);
        Print print2 = System.out::println;
        
        print1.display(100);
        print2.display(100);
        
        // 使用 Consumer
        // void accept(T t)
        Consumer<String> consumer = (x) -> System.out.println(x + x);
        consumer.accept("Ha");
        
    }
}
