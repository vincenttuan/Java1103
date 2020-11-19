package com.ocp6;

public class SideMeal {
    private String name;
    private String size;
    private int price;
    // 建構子
    public SideMeal() {
    }

    public SideMeal(String name, String size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public SideMeal(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 封裝方法 getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SideMeal{" + "name=" + name + ", size=" + size + ", price=" + price + '}';
    }
    
    
}
