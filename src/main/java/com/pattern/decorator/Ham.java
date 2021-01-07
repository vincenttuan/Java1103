package com.pattern.decorator;

public class Ham extends SiteDish {
    public Ham(Food food) {
        super(food);
        name = "火腿";
        price = 30;
    }
    
}
