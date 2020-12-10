package com.ocp11.case1;

public interface Game {
    void play();
    default int price() {
        return 99;
    }
}
