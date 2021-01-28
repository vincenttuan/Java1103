package com.ocp31_db.drink;

import java.util.Scanner;

public class DrinkStore {
    private static boolean exit;
    public static void main(String[] args) throws Exception {
        while (!exit) {            
            menu();
            if(!exit) {
                System.out.println("按下Enter繼續...");
                System.in.read(); // 按下Enter繼續...
            }
        }
    }
    
    public static void menu() {
        System.out.println("-----------------------------------------");
        System.out.println("1. Read");
        System.out.println("2. Create");
        System.out.println("3. Update amount");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
        System.out.println("-----------------------------------------");
        service();
    }
    
    public static void service() {
        DrinkDao dao = new DrinkDao();
        Scanner sc = new Scanner(System.in);
        System.out.print("==> ");
        int n = sc.nextInt();
        switch(n) {
            case 1:
                dao.read();
                break;
            case 2:
                System.out.print("Please input drink name: ");
                String name = sc.next();
                System.out.print("Please input drink price: ");
                int price = sc.nextInt();
                System.out.print("Please input drink amount: ");
                int amount = sc.nextInt();
                dao.create(name, price, amount);
                break;
            case 3:
                System.out.print("Please input update id: ");
                int updateId = sc.nextInt();
                System.out.print("Please input drink amount for update: ");
                int updateAmount = sc.nextInt();
                dao.update(updateId, updateAmount);
                break;
            case 4:
                System.out.print("Please input delete id: ");
                int deleteId = sc.nextInt();
                dao.delete(deleteId);
                break;
            case 5:
                exit = true;
        }
    }
    
    
}
