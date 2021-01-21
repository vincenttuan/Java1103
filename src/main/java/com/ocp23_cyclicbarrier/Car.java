package com.ocp23_cyclicbarrier;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Car extends Thread {
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
            cb.await(10, TimeUnit.SECONDS); // 等待其他人
            System.out.printf("%s 繼續往高雄前進\n", name);
            Thread.sleep(new Random().nextInt(5000));
        } catch (Exception e) {
            System.out.printf("%s 等不耐了 ! %s\n", name, e.toString());
        }
        System.out.printf("%s 到高雄了\n", name);
    }
    
}
