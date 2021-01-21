package com.ocp23_cyclicbarrier;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private CyclicBarrier cb;

    public Car(CyclicBarrier cb) {
        this.cb = cb;
    }
    
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.printf("%s 從台北出發\n", name);
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.printf("%s 到台中了\n", name);
            cb.wait(); // 等待其他人
            System.out.printf("%s 繼續往高雄前進\n", name);
            Thread.sleep(new Random().nextInt(5000));
        } catch (Exception e) {
        }
        System.out.printf("%s 到高雄了\n", name);
    }
    
}
