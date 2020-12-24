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
            // 檢查手邊的牌
            System.out.printf("你的牌是: %s 目前分數: %.1f \n", 
                              myPokers, getScore(myPokers));
            
            // 先判斷是否爆了 ?
            if(getScore(myPokers) > 10.5) {
                System.out.println("爆了~");
                break;
            }
            // 是否 過五關
            if(myPokers.size() == 5) {
                System.out.println("完美結束過五關, 恭喜你贏了~");
                break;
            }
            // 是否 10.5
            if(getScore(myPokers) == 10.5) {
                System.out.println("完美結束10點半, 恭喜你贏了~");
                break;
            }
            // 是否要拿牌 ?
            Scanner sc = new Scanner(System.in);
            System.out.print("是否要牌(y/n) ? ");
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
