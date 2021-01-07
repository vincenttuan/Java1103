package com.ocp16;

class Foo extends RuntimeException {
}
class Bar extends RuntimeException {
}
class Sub extends Bar {
}

public class ExceptionDemo6 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (Foo | Bar e) {
        }
//        try {
//            System.out.println(10/0);
//        } catch (Sub | Bar e) { // Bar 與 Sub 有繼承關係所以會錯誤
//        }
        try {
            System.out.println(10/0);
        } catch (Sub | Foo e) {
        }
    }
}
