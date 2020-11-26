package com.ocp8;

public class Main2 {
    public static void main(String[] args) {
        int rentCarAmount = 2;
        RentalCompany rc = new RentalCompany();
        boolean success = rc.rentCar(rentCarAmount);
        if(success) {
            System.out.printf("租車 %d 台成功, 租金: %,d\n", 
                    rentCarAmount, rc.getRent());
        } else {
            System.out.printf("租車 %d 台失敗(庫存不足)\n", rentCarAmount);
        }
        // 列印庫存
        rc.print();
    }
}
