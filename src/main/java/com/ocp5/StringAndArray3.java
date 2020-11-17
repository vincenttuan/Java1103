package com.ocp5;

import java.util.Arrays;
import java.util.Random;

public class StringAndArray3 {
    public static void main(String[] args) {
        Random r = new Random();
        String id = "A";
        id += r.nextInt(2) + 1; // 1~2
        id += r.nextInt(10); // 0~9
        id += r.nextInt(10);
        id += r.nextInt(10);
        id += r.nextInt(10);
        id += r.nextInt(10);
        id += r.nextInt(10);
        id += r.nextInt(10);
        id += r.nextInt(10);
        // 1 0 1 2 3 4 5 6 7 8 9 <- int[]
        char[] cs = id.toCharArray();
        System.out.println(Arrays.toString(cs));
        int[] idIntArray = new int[11];
        if(cs[0] == 'A') {
            idIntArray[0] = 1;
            idIntArray[1] = 0;
        }
        for(int i=1;i<cs.length;i++) {
            idIntArray[i+1] = cs[i] - 48;
        }
        System.out.println(Arrays.toString(idIntArray));
        int[] delta = {1, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1};
        System.out.println(Arrays.toString(delta));
        int sum = 0;
        for(int i=0;i<idIntArray.length;i++) {
            sum += idIntArray[i] * delta[i];
        }
        System.out.println(sum);
        boolean check = sum % 10 == 0;
        System.out.println(check);
        if(!check) {
            main(null);
        }
    }
}
