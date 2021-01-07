package com.pattern.observer;

// 被觀察者 (主題, youtuber)
public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObserver(String data);
}
