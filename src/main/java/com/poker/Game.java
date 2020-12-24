package com.poker;

public class Game {
    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.setColor("\u001B[31m");
        poker.setName("A");
        poker.setScore(1);
        System.out.println(poker);
    }
}
