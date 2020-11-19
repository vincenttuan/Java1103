package com.ocp6;

public class Hamburger {
    private String name;
    private int price;

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

    public String toString() {
        return name + " $" + price;
    }
    
}
