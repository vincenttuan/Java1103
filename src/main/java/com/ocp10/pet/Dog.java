package com.ocp10.pet;

public abstract class Dog implements Pet {

    @Override
    public void eat() {
        System.out.println("狗食");
    }
    
}
