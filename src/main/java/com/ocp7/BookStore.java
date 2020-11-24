package com.ocp7;

public class BookStore {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setName("Java");
        b1.setPrice(100);
        Book b2 = new Book();
        b2.setName("VB");
        b2.setPrice(80);
        System.out.println(b1);
        System.out.println(b2);
    }
}
