package com.ocp8;

import java.util.Arrays;

public class Main {
    // 主程式
    public static void main(String[] args) {
        // 開公司
        RentalCompany rc = new RentalCompany();
        // 查看庫存
        Transportation[] trans = rc.getTransportations();
        System.out.println("目前庫存:" + Arrays.toString(trans));
        // 租一台車
        for(Transportation ts : trans) {
            if(ts instanceof Car) {
                ((Car)ts).play();
                Car car = (Car)ts;
                car.play();
                System.out.printf("我要租: %s\n", ts);
                int amount = ts.getAmount();
                amount = amount - 1;
                ts.setAmount(amount);
            }
            
        }
        // 更新後的庫存資料
        System.out.println("更新後庫存:" + Arrays.toString(trans));
    }
}
