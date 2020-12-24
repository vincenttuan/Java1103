package com.poker;

import java.util.LinkedList;
import java.util.Queue;

public class PokerUtil {

    public static Queue<Poker> getPokers() {
        Queue<Poker> pokers = new LinkedList<>();
        for (int j = 0; j < 2; j++) {
            for (int i = 1; i < 13; i++) {
                Poker poker = new Poker(i, "red");
                pokers.add(poker);
            }
            for (int i = 1; i < 13; i++) {
                Poker poker = new Poker(i);
                pokers.add(poker);
            }
        }
        return pokers;
    }
}
