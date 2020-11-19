package com.ocp6;

public class Mcdonalds2 {
    public static void main(String[] args) {
        // 商品
        Hamburger h1 = new Hamburger("大麥克", 70);
        Hamburger h2 = new Hamburger("麥香魚", 50);
        SideMeal s1 = new SideMeal("薯條", "大", 55);
        SideMeal s2 = new SideMeal("沙拉", 40);
        Drink d1 = new Drink("可樂", 30);
        Drink d2 = new Drink("咖啡", 50);
        
        // 我買了
        Hamburger[] hamburgers = {h1, h2};
        SideMeal[] sideMeals = {s1, s2};
        Drink[] drinks = {d1, d2};
        // 總金額
        int sum = 0;
        for(Hamburger hamburger : hamburgers) {
            sum += hamburger.getPrice();
        }
        for(SideMeal sideMeal : sideMeals) {
            sum += sideMeal.getPrice();
        }
        for(Drink drink : drinks) {
            sum += drink.getPrice();
        }
        System.out.printf("總金額: $%d\n", sum);
    }
}
