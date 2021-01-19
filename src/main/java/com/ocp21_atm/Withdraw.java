package com.ocp21_atm;

// 提款執行緒(工作)
public class Withdraw implements Runnable {
    private Account account;
    private int x;
    public Withdraw(Account account, int x) {
        this.account = account;
        this.x = x;
    }
    @Override
    public void run() {
        // 去執行提款的邏輯
        account.withdraw(x);
    }
}
