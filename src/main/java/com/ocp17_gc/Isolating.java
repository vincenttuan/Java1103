package com.ocp17_gc;

class Island { // 本島
    Island i; // 附屬島嶼
    int price;
    public Island(int price) {
        this.price = price;
    }
}

public class Isolating {
    public static void main(String[] args) {
        Island a = new Island(100);
        Island b = new Island(200);
        Island c = new Island(300);
        a.i = b; // a 的附屬島嶼是 b
        b.i = c; // b 的附屬島嶼是 c
        System.out.println(a.price);
        System.out.println(a.i.price);
        System.out.println(a.i.i.price);
        
    }
}
