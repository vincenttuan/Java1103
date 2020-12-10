package com.ocp11.case2;

public class PlayGame {
    public static void main(String[] args) {
        Game game = new Airplane();
        game.play();
        System.out.println(game.price());
    }
}
