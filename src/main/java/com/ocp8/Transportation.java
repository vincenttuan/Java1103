package com.ocp8;

// 交通工具 (父類別)
public class Transportation {
    private String name;
    private int amount;
    private int km;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Transportation{" + "name=" + name + ", amount=" + amount + ", km=" + km + ", price=" + price + '}';
    }
    
}
