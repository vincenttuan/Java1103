package com.ocp11;

public interface Game {
    void play();
    default int price() {
        return 99;
    }
}
