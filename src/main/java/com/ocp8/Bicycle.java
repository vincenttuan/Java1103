package com.ocp8;

public class Bicycle extends Transportation {

    public Bicycle() {
    }
    
    public Bicycle(String name, int amount, int km, int price) {
        setName(name);
        setAmount(amount);
        setKm(km);
        setPrice(price);
    }
    
    public void message() {
        System.out.println("早上9點可以騎到晚上9點");
    }
}
