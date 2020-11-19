package com.ocp6;

public class Hamburger {
    private String name;
    private int price;
    
    // 建構子
    public Hamburger() {
    }

    public Hamburger(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    // 方法
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
        if(price > 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Hamburger{" + "name=" + name + ", price=" + price + '}';
    }
    
    
}
