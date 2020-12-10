package com.ocp11.case4;

public class Bar {
    public void hello() {
        class Foo {
            void printMe() {
                System.out.println("I am Foo");
            }
        }
        Foo foo = new Foo();
        foo.printMe();
    }
}
