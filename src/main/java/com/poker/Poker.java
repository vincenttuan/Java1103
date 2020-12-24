package com.poker;

public class Poker {
    private String name; // A~K
    private int score; // 1~13
    private String color = "\u001B[30m"; // 黑色 : "\u001B[30m" 紅色 :"\u001B[31m"

    public Poker() {
    }
    
    public Poker(int score) {
        this(score, "black");
    }
    
    public Poker(int score, String color) {
        this.score = score;
        if(color.equalsIgnoreCase("red")) {
            this.color = "\u001B[31m";
        }
        if(score == 1) name = "A";
        else if(score == 11) name = "J";
        else if(score == 12) name = "Q";
        else if(score == 13) name = "K";
        else name = score + "";
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + name;
    }
    
}
