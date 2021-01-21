package com.ocp25_threadpool;

public class ShortJob implements Runnable {

    @Override
    public void run() {
        System.out.println("短工作任務");
    }
    
}
