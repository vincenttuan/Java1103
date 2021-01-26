package com.ocp29_callback;

import javax.swing.JOptionPane;

public class ScoreMain {
    private static int sum = 0;
    private static int count = 5;
    public static void main(String[] args) {
        Callback cb = (n) -> {
            System.out.printf("主程式得到: %d\n", n);
            sum += n;
            System.out.printf("sum: %d\n", sum);
            count--;
            System.out.println("count:" +count);
            if(count == 0) {
                JOptionPane.showMessageDialog(null, "程式執行完畢!");
            }
        };
        System.out.println("工作開始");
        final int amount = count;
        for(int i=0;i<amount;i++) {
            new Thread(new Score(cb)).start();
        }
        System.out.println("等待結果...");
    }
}
