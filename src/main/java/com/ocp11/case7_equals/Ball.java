package com.ocp11.case7_equals;

public class Ball {
    private int price;
    private String color;

    public Ball(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" + "price=" + price + ", color=" + color + '}';
    }
    
}
