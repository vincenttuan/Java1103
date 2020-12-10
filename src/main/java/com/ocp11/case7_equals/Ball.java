package com.ocp11.case7_equals;

import java.util.Objects;

public class Ball {
    private int price;
    private String color;

    public Ball(int price, String color) {
        this.price = price;
        this.color = color;
    }
    
//    // 覆寫 equals 方法
//    @Override
//    public boolean equals(Object obj) {
//        Ball b = (Ball)obj;
//        if(b.price == price && b.color.equals(color)) {
//            return true;
//        }
//        return false;
//    }
//    
//    // 覆寫 hashcode 方法
//
//    @Override
//    public int hashCode() {
//        // 公式: 2 個質數 + 或 * 上有比較的屬性值
//        return 7 * 11 * price + color.hashCode();
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.price;
        hash = 79 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ball other = (Ball) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
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
