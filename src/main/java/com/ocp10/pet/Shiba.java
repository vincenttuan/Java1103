package com.ocp10.pet;

public class Shiba extends Dog {
    private int price;

    public Shiba(int price) {
        this.price = price;
    }
    
    @Override
    public int getPrice() {
        return price;
    }
    
}
