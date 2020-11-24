package com.ocp7.zoo;

public class Lion extends Animal {

    public Lion() {
    }

    public Lion(String name, int foot) {
        super(name, foot);
    }
    
    @Override
    public void move() {
        System.out.println("會跑");
    }
}
