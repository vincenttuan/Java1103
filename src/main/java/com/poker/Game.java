package com.poker;

import static com.poker.PokerUtil.getPokers;
import static com.poker.PokerUtil.getScore;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Queue<Poker> pokers = getPokers();
        Collections.shuffle((List)pokers);
        play(pokers);
    }
    public static void play(Queue<Poker> pokers) {
        List<Poker> myPokers = new LinkedList<>(); // 我手邊的牌
        do {            
            Scanner sc = new Scanner(System.in);
            System.out.printf("你的牌是: %s 目前分數: %.1f 是否要牌(y/n) ? ", myPokers, getScore(myPokers));
            String yn = sc.next();
            if(yn.equals("y")) {
                Poker poker = pokers.poll();
                myPokers.add(poker);
            } else {
                break;
            }
        } while (true);
    }
}
