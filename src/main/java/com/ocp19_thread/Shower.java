package com.ocp19_thread;

import java.util.logging.Level;
import java.util.logging.Logger;

class Father extends Thread {
    @Override
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒瓦斯");
        System.out.println("爸爸打電話叫瓦斯");
        Worker worker = new Worker();
        worker.start();
        
        try {
            // 暫停
            worker.join(10_000);
        } catch (InterruptedException ex) {
            
        }
        
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }
}

class Worker extends Thread {

    @Override
    public void run() {
        System.out.println("工人送瓦斯中...");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "秒鐘  ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) { // 中斷例外
                System.out.println("瓦斯工人發生意外");
                return;
            }
        }
        System.out.println();
        System.out.println("工人將瓦斯送到");
    }
    
}

public class Shower {
    public static void main(String[] args) {
        Father father = new Father();
        father.start();
    }
}
