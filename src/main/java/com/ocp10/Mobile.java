package com.ocp10;

public class Mobile implements Computer {

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public String getName() {
        return "手機";
    }
    
}
