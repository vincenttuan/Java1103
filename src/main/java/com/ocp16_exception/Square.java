package com.ocp16_exception;

// 計算面積的類別
public class Square {
    public int getArea(int w, int h) {
        //int area = w + h; // v1.0
        int area = w * h; // v2.0
        return area;
    }
}
