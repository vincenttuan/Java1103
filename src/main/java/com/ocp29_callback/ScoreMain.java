package com.ocp29_callback;

public class ScoreMain {
    private static int sum = 0;
    public static void main(String[] args) {
        Callback cb = (n) -> {
            System.out.printf("主程式得到: %d\n", n);
            sum += n;
            System.out.printf("sum: %d\n", sum);
        };
        System.out.println("工作開始");
        new Thread(new Score(cb)).start();
        new Thread(new Score(cb)).start();
        new Thread(new Score(cb)).start();
        new Thread(new Score(cb)).start();
        new Thread(new Score(cb)).start();
        System.out.println("等待結果...");
    }
}
