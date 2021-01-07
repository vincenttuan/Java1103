package com.pattern.decorator;

public class Tuna extends SiteDish {
    public Tuna(Food food) {
        super(food);
        name = "鮪魚";
        price = 25;
    }
    
}
