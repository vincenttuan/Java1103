package com.poker;

public class Poker {

    private String name; // A~K
    private double score; // 1~10, 0.5
    private String color = "\u001B[30m"; // 黑色 : "\u001B[30m" 紅色 :"\u001B[31m"

    public Poker() {
    }

    public Poker(double score) {
        this(score, "black");
    }

    public Poker(double score, String color) {

        if (color.equalsIgnoreCase("red")) {
            this.color = "\u001B[31m";
        }
        if (score == 1) {
            name = "A";
            this.score = 1;
        } else if (score == 11) {
            name = "J";
            this.score = 0.5;
        } else if (score == 12) {
            name = "Q";
            this.score = 0.5;
        } else if (score == 13) {
            name = "K";
            this.score = 0.5;
        } else {
            name = (int)score + "";
            this.score = score;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
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
        return color + name + "\u001B[30m";
    }

}
