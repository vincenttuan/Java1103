package com.ocp10.computer;

public interface Computer {
    int volt = 110; // 伏特, public static final
    int add(int x, int y); // 計算, public abstract
    String getName(); // 品牌, public abstract
}
