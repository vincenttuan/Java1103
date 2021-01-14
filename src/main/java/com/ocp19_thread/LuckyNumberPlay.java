package com.ocp19_thread;

public class LuckyNumberPlay {
    public static void main(String[] args) {
        LuckyNumber n1 = new LuckyNumber();
        LuckyNumber n2 = new LuckyNumber();
        n1.setName("小明");
        n2.setName("小華");
        n1.start();
        n2.start();
    }
}
