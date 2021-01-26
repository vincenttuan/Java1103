package com.ocp29_callback;

import java.util.Random;

public class Score implements Runnable {
    private Callback cb;

    public Score(Callback cb) {
        this.cb = cb;
    }
    
    @Override
    public void run() {
        Random r = new Random();
        try {
            Thread.sleep(r.nextInt(10_000));
            int score = r.nextInt(101);
            String name = Thread.currentThread().getName();
            System.out.printf("%s 得到 $d\n", name, score);
            cb.setValue(score);
        } catch (Exception e) {
        }
        
    }
    
}
