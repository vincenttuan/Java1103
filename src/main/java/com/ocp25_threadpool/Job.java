package com.ocp25_threadpool;

import java.util.concurrent.TimeUnit;

public class Job implements Runnable {

    @Override
    public void run() {
        System.out.println("一般工作任務-開始");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
        }
        System.out.println("一般工作任務-結束");
    }
    
}
