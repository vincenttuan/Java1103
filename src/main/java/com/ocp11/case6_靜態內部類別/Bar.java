package com.ocp11.case6_靜態內部類別;

public class Bar {
    int x = 100;
    // 靜態內部類別
    // 可以有 static 成員與 instance 成員
    public static class Foo {
        public static void printMe() {
            System.out.println("I am Foo");
        }
        public void hello() {
            System.out.println("I am Hello");
        }
    }
    // 一般內部類別
    // 只能有 instance 成員
    public class Hoo {
        public void hello() {
            System.out.println("I am Hello");
            Foo.printMe();
        }
    }
    
}
