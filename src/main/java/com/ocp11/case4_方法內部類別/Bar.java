package com.ocp11.case4_方法內部類別;

public class Bar {
    public void hello() {
        int x = 100; // 在 Java 8 之後就可以不用加 final
        //x++;
        class Foo {
            void printMe() {
                System.out.println("I am Foo");
                // 若要存取 hello() 外部方法的區域變數
                // 則該便是必須是 final
                System.out.println(x);
            }
        }
        Foo foo = new Foo();
        foo.printMe();
    }
    
}
