package com.ocp22_wait_notify;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cookie {
    
    private boolean empty = true; // 盤子的狀態
    
    // 吃餅乾
    public synchronized void eat(int no) {
        if(empty) {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        String name = Thread.currentThread().getName();
        System.out.printf("%s 吃了第 %d 塊餅乾\n", name, no);
        empty = true;
        notify();
    }
    
    // 放餅乾
    public synchronized void put(int no) {
        if(!empty) {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        String name = Thread.currentThread().getName();
        System.out.printf("%s 放了第 %d 塊餅乾\n", name, no);
        empty = false;
        notify();
    }
    
}
