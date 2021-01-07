package com.ocp16_exception;

// 電力換算
// V 電壓 W 瓦數 A 電流
public class Power {
    public int getV(int w, int a) {
        int v = w / a;
        return v;
    }
    
}
