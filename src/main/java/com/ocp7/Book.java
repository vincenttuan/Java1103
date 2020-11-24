package com.ocp7;

public class Book {
    public static String publishName = "gotop";
    private String name;
    private int price;
    
    public Book() {
        System.out.println("執行 Book 建構子 1");
    }
    
    public Book(String name, int price) {
        System.out.println("執行 Book 建構子 2");
        this.name = name;
        this.price = price;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "publishName=" + publishName + ", name=" + name + ", price=" + price + '}';
    }

    
    
}
