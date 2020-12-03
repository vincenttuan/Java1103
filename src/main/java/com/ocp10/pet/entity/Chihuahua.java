package com.ocp10.pet.entity;

public class Chihuahua extends Dog {
    private int price;

    public Chihuahua(int price) {
        this.price = price;
    }
    
    @Override
    public int getPrice() {
        return price;
    }
}
