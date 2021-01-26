package com.ocp28_lock;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Lotto implements Runnable {
    private String name;
    private static final ReentrantLock lock = new ReentrantLock();
    public Lotto(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try {
            // 要連續取得
            for(int i=1;i<=5;i++) {
                Thread.sleep(1000); // 模擬要花費的時間
                int n = new Random().nextInt(100);
                System.out.printf("%s 取到 %n, %s\n", name, n, new Date().toString());
            }
        } catch (Exception e) {
        }
    }
    
}
