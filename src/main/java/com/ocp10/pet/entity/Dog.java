package com.ocp10.pet.entity;

public abstract class Dog implements Pet {

    @Override
    public void eat() {
        System.out.println("狗食");
    }
    
}
