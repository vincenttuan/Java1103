package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class News implements Subject {
    private List<Observer> observers = new ArrayList<>(); // 我的觀察者列表(粉絲人數)
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
