package com.ocp8;

public class Main2 {
    public static void main(String[] args) {
        int rentCarAmount = 2;
        int rentBicycleAmount = 5;
        int rentAirplaneAmount = 3;
        RentalCompany rc = new RentalCompany();
        boolean success  = rc.rentCar(rentCarAmount);
        boolean success2 = rc.rentBicycle(rentBicycleAmount);
        boolean success3 = rc.rentAirplane(rentAirplaneAmount);
        if(success) {
            System.out.printf("租車 %d 台成功, 累計租金: %,d\n", 
                    rentCarAmount, rc.getRent());
        } else {
            System.out.printf("租車 %d 台失敗(庫存不足)\n", rentCarAmount);
        }
        if(success2) {
            System.out.printf("租腳踏車 %d 台成功, 累計租金: %,d\n", 
                    rentBicycleAmount, rc.getRent());
        } else {
            System.out.printf("租車 %d 台失敗(庫存不足)\n", rentCarAmount);
        }
        if(success3) {
            System.out.printf("租飛機 %d 台成功, 累計租金: %,d\n", 
                    rentAirplaneAmount, rc.getRent());
        } else {
            System.out.printf("租車 %d 台失敗(庫存不足)\n", rentCarAmount);
        }
        // 列印庫存
        rc.print();
    }
}
