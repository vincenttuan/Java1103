package com.poker;

import static com.poker.PokerUtil.getPokers;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Game {
    public static void main(String[] args) {
        Queue<Poker> pokers = getPokers();
        System.out.println(pokers);
        Collections.shuffle((List)pokers);
        System.out.println(pokers);
    }
}
