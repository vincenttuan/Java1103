package com.ocp11.case2;

public abstract class Game {
    public int price() {
        return 99;
    }
    abstract void play();
    
    // 多做一個 copyright 方法 
    public void copyRight() {
        System.out.println("版權所有");
    }
}
