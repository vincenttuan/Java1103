package com.ocp11.case4;

public class Bar {
    int x = 1000;
    public void hello() {
        int x = 100;
        class Foo {
            void printMe() {
                System.out.println("I am Foo");
                System.out.println(x);
            }
        }
        Foo foo = new Foo();
        foo.printMe();
    }
}
