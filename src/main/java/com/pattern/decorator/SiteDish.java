package com.pattern.decorator;

public class SiteDish extends Food {
    
    protected Food food;
    
    public SiteDish(Food food) {
        this.food = food;
    }
    
    @Override
    public String getName() {
        return name + " + " + food.getName();
    }

    @Override
    public int getPrice() {
        return price + food.getPrice();
    }
    
}
