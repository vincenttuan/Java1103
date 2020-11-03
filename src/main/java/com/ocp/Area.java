package com.ocp;

public class Area {
    int w;
    int h;
    void calcAndPrint(){
        int sum = w * h;
        System.out.println(sum);
    }
    int calcNotPrint(){
        int sum = w * h;
        return sum;
    }
}