package com.ocp22_wait_notify;

// 吃餅乾的工作
public class Eat implements Runnable {
    private Cookie cookie;

    public Eat(Cookie cookie) {
        this.cookie = cookie;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            cookie.eat(i);
        }
    } 
}
