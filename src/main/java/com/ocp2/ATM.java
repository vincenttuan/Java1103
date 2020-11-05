package com.ocp2;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Account ac1 = null;
        atm_loop: // 迴圈的名字
        do {            
            // menu ---------------------------
            System.out.println("------------");
            System.out.println("1: 建立新帳戶");
            System.out.println("2: 存款");
            System.out.println("3: 提款");
            System.out.println("4: 查詢");
            System.out.println("9: 離開");
            System.out.println("------------");
            Scanner sc = new Scanner(System.in);
            System.out.print("請選擇(1~9): ");
            // --------------------------------
            int no = sc.nextInt(); // 選擇系統項目
            switch(no) {
                case 1:
                    System.out.println("建立新帳戶");
                    ac1 = new Account();
                    System.out.print("請輸入帳戶名稱: ");
                    String name = sc.next();
                    ac1.name = name;
                    break;
                case 2:
                    System.out.println("存款");
                    if(ac1 != null) {
                        System.out.print("請輸入存款金額: ");
                        int money = sc.nextInt();
                        ac1.setBalance(money);
                    } else {
                        System.out.println("請先建立帳戶資料!");
                    }
                    break;
                case 3:
                    System.out.println("提款");
                    if(ac1 != null) {
                        System.out.print("請輸入提款金額: ");
                        int money = sc.nextInt();
                        ac1.withdraw(money);
                    } else {
                        System.out.println("請先建立帳戶資料!");
                    }
                    break;
                case 4:
                    System.out.println("查詢");
                    if(ac1 != null) {
                        ac1.printBalance();
                    } else {
                        System.out.println("請先建立帳戶資料!");
                    }
                    break;
                case 9:
                    System.out.println("離開");
                    break atm_loop;
            }
            // 按下 Enter 鍵後繼續
            System.out.println("按下 Enter 鍵後繼續 ...");
            new Scanner(System.in).nextLine();
        } while (true);
    }
}