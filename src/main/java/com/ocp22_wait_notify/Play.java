package com.ocp22_wait_notify;

public class Play {
    public static void main(String[] args) {
        // 資源:餅乾
        Cookie cookie = new Cookie();
        // 工作
        Runnable eat = new Eat(cookie);
        Runnable put = new Put(cookie);
        // 建立執行緒
        Thread master = new Thread(put, "主人");
        Thread dog = new Thread(eat, "小白狗");
        // 啟動執行緒
        master.start();
        dog.start();
    }
}
