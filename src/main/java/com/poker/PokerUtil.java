package com.poker;

import java.util.LinkedList;
import java.util.Queue;

public class PokerUtil {
    public static Queue<Poker> getPokers() {
        Queue<Poker> pokers = new LinkedList<>();
        for (int i = 1; i < 13; i++) {
            Poker poker = new Poker(i, "red");
        }
    }
}
