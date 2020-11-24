package com.ocp7.zoo;

public class Bird extends Animal {

    public Bird() {
    }

    public Bird(String name, int foot) {
        super(name, foot);
    }
    
    @Override
    public void move() {
        System.out.println("會飛");
    }
    
}
