package com.ocp4;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int[] ans = RandomNumber.getRandomNumber(4);
        System.out.println(Arrays.toString(ans));

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入四位數: ");
            String input = sc.next();
            int[] guess = {input.charAt(0) - 48, input.charAt(1) - 48, input.charAt(2) - 48, input.charAt(3) - 48};
            System.out.println(Arrays.toString(guess));

        } while (true);

    }
}
