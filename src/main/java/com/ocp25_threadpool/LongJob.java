package com.ocp25_threadpool;

import java.util.concurrent.TimeUnit;

public class LongJob implements Runnable {

    @Override
    public void run() {
        System.out.println("長工作任務-開始");
        try {
            TimeUnit.SECONDS.sleep(5); // 相當於 Thread.sleep(5000);
        } catch (Exception e) {
        }
        
        System.out.println("長工作任務-結束");
    }
    
}
