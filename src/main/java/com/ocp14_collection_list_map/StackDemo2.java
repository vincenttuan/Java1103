package com.ocp14_collection_list_map;

// 利用堆疊實作字串反轉並印出

import java.util.Stack;

public class StackDemo2 {
    public static void main(String[] args) {
        String str = "Java";
        // 將每一個字放入到堆疊
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++) {
            stack.add(str.charAt(i));
        }
        System.out.println(stack);
        System.out.print("反轉: ");
        while (!stack.isEmpty()) {            
            System.out.print(stack.pop());
        }
    }
}
