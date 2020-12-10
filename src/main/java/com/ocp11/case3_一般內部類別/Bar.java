package com.ocp11.case3_一般內部類別;

public class Bar {
    int x = 1000;
    public class Foo {
        int x = 100;
        public void printMe() {
            int x = 10;
            System.out.println("I am Foo");
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Bar.this.x);
        }
    }
}
