package com.ocp7;

public class BookStore {
    public static void main(String[] args) {
        Book.publishName = "Microsoft";
        Book b1 = new Book();
        b1.setName("Java");
        b1.setPrice(100);
        b1.publishName = "Oracle";
        Book b2 = new Book();
        b2.setName("VB");
        b2.setPrice(80);
        b2.publishName = "IBM";
        Book b3 = new Book("Python", 70);
        b3.publishName = "Pcschool";
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
