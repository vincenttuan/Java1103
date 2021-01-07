package com.pattern.decorator;

public class Onion extends SiteDish {
    public Onion(Food food) {
        super(food);
        name = "洋蔥";
        price = 12;
    }
    
}
