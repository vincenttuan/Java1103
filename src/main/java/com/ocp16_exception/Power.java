package com.ocp16_exception;

// 電力換算
// V 電壓 W 瓦數 A 電流
public class Power {
    public int getV(int w, int a) {
        int v = w / a;
        return v;
    }
    public int getA(int w, int v) {
        int a = w / v;
        return a;
    }
    public int getW(int v, int a) {
        int w = v * a;
        return w;
    }
    
}
