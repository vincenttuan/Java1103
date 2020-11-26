package com.ocp8;

public class Car extends Transportation {

    public Car() {
    }
    
    public Car(String name, int amount, int km, int price) {
        setName(name);
        setAmount(amount);
        setKm(km);
        setPrice(price);
    }
    
    public void play() {
        System.out.println("我可以撸...");
    }
    
}
