package com.pattern.decorator;

public abstract class Food {
    protected String name; // 品名
    protected int price;   // 價格
    public abstract String getName();
    public abstract int getPrice();
}
