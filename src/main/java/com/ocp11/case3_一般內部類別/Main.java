package com.ocp11.case3_一般內部類別;

public class Main {
    public static void main(String[] args) {
        // 第 1 種宣告方法:
        //Bar.Foo foo = new Bar().new Foo();
        //foo.printMe();
        
        // 第 2 種宣告方法:
        Bar bar = new Bar();
        Bar.Foo foo = bar.new Foo();
        foo.printMe();
        
        // 第 3 種宣告方法:
        new Bar().new Foo().printMe();
    }
}
