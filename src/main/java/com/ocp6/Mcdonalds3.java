package com.ocp6;

import java.util.Arrays;

public class Mcdonalds3 {
    public static void main(String[] args) {
        // 商品
        Hamburger h1 = new Hamburger("大麥克", 70);
        Hamburger h2 = new Hamburger("麥香魚", 50);
        SideMeal s1 = new SideMeal("薯條", "大", 55);
        SideMeal s2 = new SideMeal("沙拉", 40);
        Drink d1 = new Drink("可樂", 30);
        Drink d2 = new Drink("咖啡", 50);
        
        // 套餐
        SetMeal sone = new SetMeal(h1, s1, d1);
        SetMeal stwo = new SetMeal(h2, s2, d2);
        
        SetMeal[] setMeals = {sone, stwo};
        int sum = 0;
        for(SetMeal setMeal : setMeals) {
            sum += setMeal.getSum();
        }
        System.out.printf("總金額: $%d\n", sum);
        System.out.println(Arrays.toString(setMeals));
    }
}
