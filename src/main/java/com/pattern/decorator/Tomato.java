package com.pattern.decorator;

public class Tomato extends SiteDish {
    public Tomato(Food food) {
        super(food);
        name = "番茄";
        price = 15;
    }
    
}
