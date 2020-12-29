package com.ocp14;

import com.github.javafaker.Faker;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.add(faker.name().lastName());
        }
        System.out.println("依序進電梯: " + stack);
        while (!stack.isEmpty()) {            
            String name = stack.pop();
            System.out.printf("%s 從電梯出來, 電梯內還有: %s\n", name, stack);
        }
    }
}
