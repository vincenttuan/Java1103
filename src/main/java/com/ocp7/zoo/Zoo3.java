package com.ocp7.zoo;

public class Zoo3 {
    public static void main(String[] args) {
        Bird bird = new Bird("鸚鵡", 2);
        bird.move();
        Lion lion = new Lion("美洲獅", 4);
        lion.move();
    }
}
